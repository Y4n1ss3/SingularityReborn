package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TableViewKt {
    private static ImageVector _tableView;

    public static final ImageVector getTableView(Icons.Rounded rounded) {
        ImageVector imageVector = _tableView;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TableView", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(19.0f, 7.0f, 9.0f);
        d.curveTo(7.9f, 7.0f, 7.0f, 7.9f, 7.0f, 9.0f);
        d.verticalLineToRelative(10.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(10.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(9.0f);
        d.curveTo(21.0f, 7.9f, 20.1f, 7.0f, 19.0f, 7.0f);
        k4.r(d, 19.0f, 10.0f, 19.0f, 10.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.horizontalLineToRelative(-8.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.horizontalLineToRelative(8.0f);
        d.curveTo(18.55f, 9.0f, 19.0f, 9.45f, 19.0f, 10.0f);
        uo.C(d, 13.0f, 15.0f, -2.0f, 2.0f);
        kf0.n(d, 2.0f, 13.0f, 15.0f, 17.0f);
        fc.y(d, 2.0f, -2.0f, -2.0f, 15.0f);
        k4.A(d, 11.0f, 15.0f, 9.0f, -2.0f);
        uo.r(d, 2.0f, 15.0f, 17.0f, 13.0f);
        bv.l(d, 2.0f, 2.0f, -2.0f, 13.0f);
        k4.C(d, 9.0f, 17.0f, 2.0f, 2.0f);
        bv.s(d, 9.0f, 17.0f, 17.0f, 19.0f);
        fc.y(d, -2.0f, 2.0f, 2.0f, 17.0f);
        d.moveTo(6.0f, 17.0f);
        d.horizontalLineTo(5.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        d.horizontalLineToRelative(10.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        bv.B(d, 1.0f, -2.0f, 5.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.f(d, 10.0f, 1.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tableView = build;
        build.getClass();
        return build;
    }
}
