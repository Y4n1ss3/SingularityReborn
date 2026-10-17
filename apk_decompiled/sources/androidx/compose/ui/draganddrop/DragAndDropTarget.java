package androidx.compose.ui.draganddrop;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface DragAndDropTarget {
    boolean onDrop(DragAndDropEvent dragAndDropEvent);

    default void onChanged(DragAndDropEvent dragAndDropEvent) {
    }

    default void onEnded(DragAndDropEvent dragAndDropEvent) {
    }

    default void onEntered(DragAndDropEvent dragAndDropEvent) {
    }

    default void onExited(DragAndDropEvent dragAndDropEvent) {
    }

    default void onMoved(DragAndDropEvent dragAndDropEvent) {
    }

    default void onStarted(DragAndDropEvent dragAndDropEvent) {
    }
}
