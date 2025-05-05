package com.paneedah.mwc.utils;

import dev.redstudio.redcore.math.vectors.Vector3D;
import dev.redstudio.redcore.math.vectors.Vector3F;
import io.netty.buffer.ByteBuf;
import lombok.experimental.UtilityClass;
import net.minecraft.util.math.Vec3d;

/// Utility class for vector operations.
///
/// Red Core Candidate
///
/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-02
/// @since 0.2
@UtilityClass
public final class VectorUtil {

    public static Vec3d convertToVec3d(Vector3D vector) {
        return new Vec3d(vector.x, vector.y, vector.z);
    }

    public static Vector3F convertToVector3F(Vec3d vector) {
        return new Vector3F((float) vector.x, (float) vector.y, (float) vector.z);
    }

    public static Vector3D convertToVector3D(Vec3d vector) {
        return new Vector3D(vector.x, vector.y, vector.z);
    }

    @UtilityClass
    public static class Networking {

        public static Vec3d read(ByteBuf byteBuf) {
            return new Vec3d(byteBuf.readDouble(), byteBuf.readDouble(), byteBuf.readDouble());
        }

        public static void read(ByteBuf byteBuf, Vector3F vector) {
            vector.x = byteBuf.readFloat();
            vector.y = byteBuf.readFloat();
            vector.z = byteBuf.readFloat();
        }

        public static void read(ByteBuf byteBuf, Vector3D vector) {
            vector.x = byteBuf.readDouble();
            vector.y = byteBuf.readDouble();
            vector.z = byteBuf.readDouble();
        }

        public static void write(ByteBuf byteBuf, Vec3d vector) {
            byteBuf.writeDouble(vector.x);
            byteBuf.writeDouble(vector.y);
            byteBuf.writeDouble(vector.z);
        }

        public static void write(ByteBuf byteBuf, Vector3F vector) {
            byteBuf.writeFloat(vector.x);
            byteBuf.writeFloat(vector.y);
            byteBuf.writeFloat(vector.z);
        }

        public static void write(ByteBuf byteBuf, Vector3D vector) {
            byteBuf.writeDouble(vector.x);
            byteBuf.writeDouble(vector.y);
            byteBuf.writeDouble(vector.z);
        }
    }
}
