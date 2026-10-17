package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class q implements Iterator, n20 {
    public final /* synthetic */ int d;
    public int e;
    public final Object f;

    public q(Object[] objArr) {
        this.d = 3;
        objArr.getClass();
        this.f = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        Object obj = this.f;
        switch (i) {
            case 0:
                if (this.e < ((t) obj).size()) {
                    break;
                }
                break;
            case 1:
                if (this.e < ((double[]) obj).length) {
                    break;
                }
                break;
            case 2:
                if (this.e < ((float[]) obj).length) {
                    break;
                }
                break;
            case 3:
                if (this.e < ((Object[]) obj).length) {
                    break;
                }
                break;
            default:
                if (this.e < ((long[]) obj).length) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        Object obj = this.f;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    o.q();
                    return null;
                }
                int i2 = this.e;
                this.e = i2 + 1;
                return ((t) obj).get(i2);
            case 1:
                try {
                    int i3 = this.e;
                    this.e = i3 + 1;
                    return Double.valueOf(((double[]) obj)[i3]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.e--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 2:
                try {
                    int i4 = this.e;
                    this.e = i4 + 1;
                    return Float.valueOf(((float[]) obj)[i4]);
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.e--;
                    throw new NoSuchElementException(e2.getMessage());
                }
            case 3:
                try {
                    int i5 = this.e;
                    this.e = i5 + 1;
                    return ((Object[]) obj)[i5];
                } catch (ArrayIndexOutOfBoundsException e3) {
                    this.e--;
                    throw new NoSuchElementException(e3.getMessage());
                }
            default:
                try {
                    int i6 = this.e;
                    this.e = i6 + 1;
                    return Long.valueOf(((long[]) obj)[i6]);
                } catch (ArrayIndexOutOfBoundsException e4) {
                    this.e--;
                    throw new NoSuchElementException(e4.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ q(Object obj, int i) {
        this.d = i;
        this.f = obj;
    }
}
