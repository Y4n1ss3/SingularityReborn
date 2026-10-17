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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoLuggageKt {
    private static ImageVector _noLuggage;

    public static final ImageVector getNoLuggage(Icons.Outlined outlined) {
        ImageVector imageVector = _noLuggage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NoLuggage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder j = kf0.j(16.0f, 13.17f, -1.5f, -1.5f, 9.0f);
        bv.s(j, 16.0f, 13.17f, 19.78f, 22.61f);
        j.lineToRelative(-1.85f, -1.85f);
        j.curveTo(17.65f, 20.91f, 17.34f, 21.0f, 17.0f, 21.0f);
        j.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        j.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        j.horizontalLineTo(9.0f);
        j.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        j.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        j.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        j.verticalLineTo(8.0f);
        j.curveToRelative(0.0f, -0.05f, 0.02f, -0.1f, 0.02f, -0.15f);
        j.lineTo(1.39f, 4.22f);
        j.lineToRelative(1.41f, -1.41f);
        gy.B(j, 18.38f, 18.38f, 19.78f, 22.61f);
        j.moveTo(16.17f, 19.0f);
        fc.u(j, -3.42f, -3.42f, 18.0f, -1.5f);
        j.verticalLineToRelative(-3.92f);
        j.lineTo(9.5f, 12.33f);
        j.verticalLineTo(18.0f);
        k4.q(j, 8.0f, -7.17f, -1.0f, -1.0f);
        bv.z(j, 19.0f, 16.17f, 12.75f, 9.0f);
        j.horizontalLineToRelative(-0.92f);
        j.lineToRelative(0.92f, 0.92f);
        j.verticalLineTo(9.0f);
        j.close();
        j.moveTo(19.0f, 8.0f);
        k4.z(j, 8.17f, -2.0f, -2.0f, 8.0f);
        j.horizontalLineToRelative(-6.17f);
        j.lineTo(9.84f, 7.01f);
        j.lineTo(9.0f, 6.17f);
        j.verticalLineTo(6.0f);
        j.verticalLineTo(3.0f);
        j.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        j.horizontalLineToRelative(4.0f);
        j.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        j.verticalLineToRelative(3.0f);
        j.horizontalLineToRelative(2.0f);
        j.curveTo(18.1f, 6.0f, 19.0f, 6.9f, 19.0f, 8.0f);
        af0.r(j, 10.5f, 6.0f, 3.0f, 3.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(j, -3.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noLuggage = build;
        build.getClass();
        return build;
    }
}
