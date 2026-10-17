package androidx.compose.material.icons.outlined;

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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HeatPumpKt {
    private static ImageVector _heatPump;

    public static final ImageVector getHeatPump(Icons.Outlined outlined) {
        ImageVector imageVector = _heatPump;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.HeatPump", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(19.0f, 3.0f, 5.0f);
        d.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        c21.d(d, 19.0f, 19.0f, 5.0f, 5.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, 14.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 18.0f);
        b.curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        b.reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f);
        b.reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f);
        b.reflectiveCurveTo(8.69f, 18.0f, 12.0f, 18.0f);
        b.close();
        b.moveTo(11.25f, 15.92f);
        b.curveToRelative(-0.55f, -0.1f, -1.05f, -0.32f, -1.5f, -0.62f);
        uf.x(b, 1.5f, -1.5f, 15.92f);
        b.moveTo(12.75f, 15.92f);
        b.verticalLineToRelative(-2.11f);
        b.lineToRelative(1.5f, 1.5f);
        b.curveTo(13.8f, 15.61f, 13.3f, 15.82f, 12.75f, 15.92f);
        k4.x(b, 15.31f, 14.25f, -1.5f, -1.5f);
        b.horizontalLineToRelative(2.11f);
        b.curveTo(15.82f, 13.3f, 15.61f, 13.8f, 15.31f, 14.25f);
        af0.l(b, 15.92f, 11.25f, -2.11f);
        b.lineToRelative(1.5f, -1.5f);
        b.curveTo(15.61f, 10.2f, 15.82f, 10.7f, 15.92f, 11.25f);
        b.close();
        b.moveTo(12.75f, 8.08f);
        b.curveToRelative(0.55f, 0.1f, 1.05f, 0.32f, 1.5f, 0.62f);
        uf.x(b, -1.5f, 1.5f, 8.08f);
        b.moveTo(12.0f, 11.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        b.curveTo(11.0f, 11.45f, 11.45f, 11.0f, 12.0f, 11.0f);
        bv.v(b, 11.25f, 8.08f, 2.11f);
        b.lineToRelative(-1.5f, -1.5f);
        b.curveTo(10.2f, 8.39f, 10.7f, 8.18f, 11.25f, 8.08f);
        k4.x(b, 8.69f, 9.75f, 1.5f, 1.5f);
        b.horizontalLineTo(8.08f);
        b.curveTo(8.18f, 10.7f, 8.39f, 10.2f, 8.69f, 9.75f);
        k4.x(b, 10.19f, 12.75f, -1.5f, 1.5f);
        b.curveToRelative(-0.3f, -0.44f, -0.51f, -0.95f, -0.62f, -1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(b, 10.19f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _heatPump = build;
        build.getClass();
        return build;
    }
}
