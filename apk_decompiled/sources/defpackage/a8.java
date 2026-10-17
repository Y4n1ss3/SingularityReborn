package defpackage;

import android.content.Context;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class a8 {
    public int a = 0;
    public float b = -1.0f;
    public float c = -1.0f;
    public float d = -1.0f;
    public int[] e = new int[0];
    public boolean f = false;
    public final l7 g;
    public final Context h;

    static {
        new RectF();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public a8(l7 l7Var) {
        this.g = l7Var;
        this.h = l7Var.getContext();
        new y7();
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }
}
