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
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MilitaryTechKt {
    private static ImageVector _militaryTech;

    public static final ImageVector getMilitaryTech(Icons.Rounded rounded) {
        ImageVector imageVector = _militaryTech;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MilitaryTech", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(17.0f, 10.43f, 3.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        d.horizontalLineTo(8.0f);
        d.curveTo(7.45f, 2.0f, 7.0f, 2.45f, 7.0f, 3.0f);
        d.verticalLineToRelative(7.43f);
        d.curveToRelative(0.0f, 0.35f, 0.18f, 0.68f, 0.49f, 0.86f);
        d.lineToRelative(4.18f, 2.51f);
        d.lineToRelative(-0.99f, 2.34f);
        d.lineToRelative(-2.22f, 0.19f);
        d.curveTo(8.0f, 16.37f, 7.82f, 16.92f, 8.16f, 17.21f);
        d.lineToRelative(1.69f, 1.46f);
        d.lineToRelative(-0.51f, 2.18f);
        d.curveToRelative(-0.1f, 0.43f, 0.37f, 0.77f, 0.75f, 0.54f);
        d.lineTo(12.0f, 20.23f);
        d.lineToRelative(1.91f, 1.15f);
        d.curveToRelative(0.38f, 0.23f, 0.85f, -0.11f, 0.75f, -0.54f);
        d.lineToRelative(-0.51f, -2.18f);
        d.lineToRelative(1.69f, -1.46f);
        d.curveToRelative(0.33f, -0.29f, 0.16f, -0.84f, -0.29f, -0.88f);
        d.lineToRelative(-2.22f, -0.19f);
        d.lineToRelative(-0.99f, -2.34f);
        d.lineToRelative(4.18f, -2.51f);
        d.curveTo(16.82f, 11.11f, 17.0f, 10.79f, 17.0f, 10.43f);
        k4.x(d, 13.0f, 12.23f, -1.0f, 0.6f);
        fc.u(d, -1.0f, -0.6f, 3.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(d, 12.23f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _militaryTech = build;
        build.getClass();
        return build;
    }
}
