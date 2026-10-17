package defpackage;

import android.view.View;
import com.lumi.singularity.R;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class yp0 extends f30 implements ky {
    public static final yp0 e;
    public static final yp0 f;
    public static final yp0 g;
    public final /* synthetic */ int d;

    static {
        int i = 1;
        e = new yp0(i, 0);
        f = new yp0(i, 1);
        g = new yp0(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yp0(int i, int i2) {
        super(i);
        this.d = i2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                obj.getClass();
                return null;
            case 1:
                View view = (View) obj;
                view.getClass();
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                view2.getClass();
                Object tag = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof td0) {
                    return (td0) tag;
                }
                return null;
        }
    }
}
