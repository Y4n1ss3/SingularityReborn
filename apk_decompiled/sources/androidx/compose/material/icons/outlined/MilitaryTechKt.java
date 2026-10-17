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
import defpackage.c21;
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MilitaryTechKt {
    private static ImageVector _militaryTech;

    public static final ImageVector getMilitaryTech(Icons.Outlined outlined) {
        ImageVector imageVector = _militaryTech;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MilitaryTech", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = j50.f(17.0f, 10.43f, 2.0f, 7.0f, 8.43f);
        f.curveToRelative(0.0f, 0.35f, 0.18f, 0.68f, 0.49f, 0.86f);
        f.lineToRelative(4.18f, 2.51f);
        f.lineToRelative(-0.99f, 2.34f);
        f.lineToRelative(-3.41f, 0.29f);
        f.lineToRelative(2.59f, 2.24f);
        f.lineTo(9.07f, 22.0f);
        f.lineTo(12.0f, 20.23f);
        f.lineTo(14.93f, 22.0f);
        f.lineToRelative(-0.78f, -3.33f);
        f.lineToRelative(2.59f, -2.24f);
        f.lineToRelative(-3.41f, -0.29f);
        f.lineToRelative(-0.99f, -2.34f);
        f.lineToRelative(4.18f, -2.51f);
        f.curveTo(16.82f, 11.11f, 17.0f, 10.79f, 17.0f, 10.43f);
        k4.x(f, 11.0f, 11.07f, -2.0f, -1.2f);
        c21.c(f, 4.0f, 2.0f, 11.07f);
        f.moveTo(15.0f, 9.87f);
        fc.u(f, -2.0f, 1.2f, 4.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(f, 9.87f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _militaryTech = build;
        build.getClass();
        return build;
    }
}
