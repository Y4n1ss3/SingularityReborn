package androidx.compose.ui.graphics.vector;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface VectorConfig {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> T getOrDefault(VectorConfig vectorConfig, VectorProperty<T> vectorProperty, T t) {
            return (T) VectorConfig.super.getOrDefault(vectorProperty, t);
        }
    }

    default <T> T getOrDefault(VectorProperty<T> vectorProperty, T t) {
        return t;
    }
}
