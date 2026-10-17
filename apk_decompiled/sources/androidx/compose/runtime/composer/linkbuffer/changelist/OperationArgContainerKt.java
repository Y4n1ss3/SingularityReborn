package androidx.compose.runtime.composer.linkbuffer.changelist;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OperationArgContainerKt {
    public static final long getLong(OperationArgContainer operationArgContainer, int i, int i2) {
        return (operationArgContainer.getInt(i) << 32) | (operationArgContainer.getInt(i2) & 4294967295L);
    }
}
