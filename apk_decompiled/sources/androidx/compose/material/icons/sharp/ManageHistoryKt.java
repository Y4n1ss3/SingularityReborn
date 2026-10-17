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
import defpackage.bv;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ManageHistoryKt {
    private static ImageVector _manageHistory;

    public static final ImageVector getManageHistory(Icons.Sharp sharp) {
        ImageVector imageVector = _manageHistory;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ManageHistory", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(22.69f, 18.37f, 1.14f, -1.0f);
        e.lineToRelative(-1.0f, -1.73f);
        e.lineToRelative(-1.45f, 0.49f);
        e.curveToRelative(-0.32f, -0.27f, -0.68f, -0.48f, -1.08f, -0.63f);
        e.lineTo(20.0f, 14.0f);
        e.horizontalLineToRelative(-2.0f);
        e.lineToRelative(-0.3f, 1.49f);
        e.curveToRelative(-0.4f, 0.15f, -0.76f, 0.36f, -1.08f, 0.63f);
        e.lineToRelative(-1.45f, -0.49f);
        e.lineToRelative(-1.0f, 1.73f);
        e.lineToRelative(1.14f, 1.0f);
        e.curveToRelative(-0.08f, 0.5f, -0.08f, 0.76f, 0.0f, 1.26f);
        e.lineToRelative(-1.14f, 1.0f);
        e.lineToRelative(1.0f, 1.73f);
        e.lineToRelative(1.45f, -0.49f);
        e.curveToRelative(0.32f, 0.27f, 0.68f, 0.48f, 1.08f, 0.63f);
        e.lineTo(18.0f, 24.0f);
        e.horizontalLineToRelative(2.0f);
        e.lineToRelative(0.3f, -1.49f);
        e.curveToRelative(0.4f, -0.15f, 0.76f, -0.36f, 1.08f, -0.63f);
        e.lineToRelative(1.45f, 0.49f);
        e.lineToRelative(1.0f, -1.73f);
        e.lineToRelative(-1.14f, -1.0f);
        e.curveTo(22.77f, 19.13f, 22.77f, 18.87f, 22.69f, 18.37f);
        e.close();
        e.moveTo(19.0f, 21.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        e.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        e.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        e.reflectiveCurveTo(20.1f, 21.0f, 19.0f, 21.0f);
        bv.v(e, 11.0f, 7.0f, 5.41f);
        e.lineToRelative(2.36f, 2.36f);
        e.lineToRelative(1.04f, -1.79f);
        j50.z(e, 13.0f, 11.59f, 7.0f, 11.0f);
        e.moveTo(21.0f, 12.0f);
        e.curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f);
        e.curveTo(9.17f, 3.0f, 6.65f, 4.32f, 5.0f, 6.36f);
        bv.A(e, 4.0f, 3.0f, 6.0f, 6.0f);
        e.verticalLineTo(8.0f);
        e.horizontalLineTo(6.26f);
        e.curveTo(7.53f, 6.19f, 9.63f, 5.0f, 12.0f, 5.0f);
        e.curveToRelative(3.86f, 0.0f, 7.0f, 3.14f, 7.0f, 7.0f);
        k4.w(e, 21.0f, 10.86f, 18.91f);
        e.curveTo(7.87f, 18.42f, 5.51f, 16.01f, 5.08f, 13.0f);
        e.horizontalLineTo(3.06f);
        e.curveToRelative(0.5f, 4.5f, 4.31f, 8.0f, 8.94f, 8.0f);
        e.curveToRelative(0.02f, 0.0f, 0.05f, 0.0f, 0.07f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(e, 10.86f, 18.91f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _manageHistory = build;
        build.getClass();
        return build;
    }
}
