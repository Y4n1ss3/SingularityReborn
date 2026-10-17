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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HeatPumpKt {
    private static ImageVector _heatPump;

    public static final ImageVector getHeatPump(Icons.Sharp sharp) {
        ImageVector imageVector = _heatPump;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.HeatPump", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(21.0f, 3.0f, 3.0f, 18.0f, 18.0f);
        bv.t(i, 3.0f, 12.75f, 7.08f);
        i.curveToRelative(0.82f, 0.12f, 1.57f, 0.44f, 2.2f, 0.91f);
        uf.x(i, -2.2f, 2.2f, 7.08f);
        i.moveTo(11.25f, 7.08f);
        i.verticalLineToRelative(3.11f);
        i.lineToRelative(-2.2f, -2.2f);
        i.curveTo(9.68f, 7.52f, 10.43f, 7.2f, 11.25f, 7.08f);
        k4.x(i, 7.99f, 9.05f, 2.2f, 2.2f);
        i.horizontalLineTo(7.08f);
        i.curveTo(7.2f, 10.43f, 7.52f, 9.68f, 7.99f, 9.05f);
        af0.l(i, 7.08f, 12.75f, 3.11f);
        i.lineToRelative(-2.2f, 2.2f);
        i.curveTo(7.52f, 14.32f, 7.2f, 13.57f, 7.08f, 12.75f);
        i.close();
        i.moveTo(11.25f, 16.92f);
        i.curveToRelative(-0.82f, -0.12f, -1.57f, -0.44f, -2.2f, -0.91f);
        uf.x(i, 2.2f, -2.2f, 16.92f);
        i.moveTo(12.0f, 13.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        i.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        i.curveTo(13.0f, 12.55f, 12.55f, 13.0f, 12.0f, 13.0f);
        bv.v(i, 12.75f, 16.92f, -3.11f);
        i.lineToRelative(2.2f, 2.2f);
        i.curveTo(14.32f, 16.48f, 13.57f, 16.8f, 12.75f, 16.92f);
        k4.x(i, 16.01f, 14.95f, -2.2f, -2.2f);
        i.horizontalLineToRelative(3.11f);
        i.curveTo(16.8f, 13.57f, 16.48f, 14.32f, 16.01f, 14.95f);
        k4.x(i, 13.81f, 11.25f, 2.2f, -2.2f);
        i.curveToRelative(0.47f, 0.64f, 0.79f, 1.39f, 0.91f, 2.2f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(i, 13.81f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _heatPump = build;
        build.getClass();
        return build;
    }
}
