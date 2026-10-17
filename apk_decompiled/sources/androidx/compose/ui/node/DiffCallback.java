package androidx.compose.ui.node;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface DiffCallback {
    boolean areItemsTheSame(int i, int i2);

    void insert(int i);

    void remove(int i, int i2);

    void same(int i, int i2);
}
