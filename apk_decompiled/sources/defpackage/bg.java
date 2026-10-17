package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class bg implements kt {
    public Object a;
    public final Object b;

    public bg(l7 l7Var) {
        this.a = l7Var;
        ot otVar = new ot(l7Var);
        this.b = otVar;
        l7Var.addTextChangedListener(otVar);
        if (ft.b == null) {
            synchronized (ft.a) {
                try {
                    if (ft.b == null) {
                        ft ftVar = new ft();
                        try {
                            ft.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, ft.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        ft.b = ftVar;
                    }
                } finally {
                }
            }
        }
        l7Var.setEditableFactory(ft.b);
    }

    @Override // defpackage.kt
    public Object a() {
        return (y01) this.a;
    }

    @Override // defpackage.kt
    public boolean b(CharSequence charSequence, int i, int i2, r01 r01Var) {
        if ((r01Var.c & 4) > 0) {
            return true;
        }
        if (((y01) this.a) == null) {
            this.a = new y01(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((ts) this.b).getClass();
        ((y01) this.a).setSpan(new s01(r01Var), i, i2, 33);
        return true;
    }

    public void c(xx xxVar) {
        vi0 vi0Var = (vi0) this.b;
        p7 p7Var = (p7) this.a;
        int i = xxVar.b;
        if (i != 0) {
            vi0Var.execute(new ag(p7Var, i));
        } else {
            vi0Var.execute(new z3(1, p7Var, xxVar.a));
        }
    }

    public bg(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.a)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.b)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public bg(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{0.0f, 1.0f};
    }

    public /* synthetic */ bg(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public bg(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{0.0f, 0.5f, 1.0f};
    }
}
