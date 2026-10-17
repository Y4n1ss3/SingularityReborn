package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class rb extends d10 {
    public final int[] d;
    public int e;

    public rb(int[] iArr) {
        this.d = iArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d.length;
    }

    @Override // defpackage.d10
    public final int nextInt() {
        try {
            int[] iArr = this.d;
            int i = this.e;
            this.e = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.e--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
