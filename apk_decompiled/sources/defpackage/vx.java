package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class vx implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ vx(String str, Context context, Object obj, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.f = context;
        this.h = obj;
        this.g = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.d;
        int i2 = this.g;
        Object obj = this.h;
        Context context = this.f;
        String str = this.e;
        switch (i) {
            case 0:
                Object[] objArr = {(sx) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return yx.b(str, context, Collections.unmodifiableList(arrayList), i2);
            default:
                try {
                    return yx.b(str, context, (List) obj, i2);
                } catch (Throwable unused) {
                    return new xx(-3);
                }
        }
    }
}
