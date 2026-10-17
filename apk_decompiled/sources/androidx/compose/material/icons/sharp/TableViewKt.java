package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.bv;
import defpackage.c21;
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TableViewKt {
    private static ImageVector _tableView;

    public static final ImageVector getTableView(Icons.Sharp sharp) {
        ImageVector imageVector = _tableView;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.TableView", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(21.0f, 7.0f, 7.0f, 14.0f, 14.0f);
        kf0.D(i, 7.0f, 19.0f, 9.0f, 2.0f);
        kp0.p(i, 9.0f, 9.0f, 19.0f);
        bv.y(i, 13.0f, 15.0f, -2.0f, 2.0f);
        kf0.n(i, 2.0f, 13.0f, 15.0f, 17.0f);
        fc.y(i, 2.0f, -2.0f, -2.0f, 15.0f);
        k4.A(i, 11.0f, 15.0f, 9.0f, -2.0f);
        uo.r(i, 2.0f, 15.0f, 17.0f, 13.0f);
        bv.l(i, 2.0f, 2.0f, -2.0f, 13.0f);
        k4.C(i, 9.0f, 17.0f, 2.0f, 2.0f);
        bv.s(i, 9.0f, 17.0f, 17.0f, 19.0f);
        fc.y(i, -2.0f, 2.0f, 2.0f, 17.0f);
        uo.p(i, 6.0f, 17.0f, 3.0f, 3.0f);
        af0.w(i, 14.0f, 3.0f, -2.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c21.e(i, 5.0f, 10.0f, 1.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tableView = build;
        build.getClass();
        return build;
    }
}
