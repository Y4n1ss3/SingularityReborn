package androidx.compose.foundation.content;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface ReceiveContentListener {
    TransferableContent onReceive(TransferableContent transferableContent);

    default void onDragEnd() {
    }

    default void onDragEnter() {
    }

    default void onDragExit() {
    }

    default void onDragStart() {
    }
}
