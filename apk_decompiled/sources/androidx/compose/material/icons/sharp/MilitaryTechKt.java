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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MilitaryTechKt {
    private static ImageVector _militaryTech;

    public static final ImageVector getMilitaryTech(Icons.Sharp sharp) {
        ImageVector imageVector = _militaryTech;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MilitaryTech", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = j50.f(17.0f, 11.0f, 2.0f, 7.0f, 9.0f);
        f.lineToRelative(4.66f, 2.8f);
        f.lineToRelative(-0.99f, 2.34f);
        f.lineToRelative(-3.41f, 0.29f);
        f.lineToRelative(2.59f, 2.24f);
        f.lineTo(9.07f, 22.0f);
        f.lineTo(12.0f, 20.23f);
        f.lineTo(14.93f, 22.0f);
        f.lineToRelative(-0.78f, -3.33f);
        f.lineToRelative(2.59f, -2.24f);
        f.lineToRelative(-3.41f, -0.29f);
        gy.B(f, -0.99f, -2.34f, 17.0f, 11.0f);
        f.moveTo(13.0f, 12.23f);
        f.lineToRelative(-1.0f, 0.6f);
        fc.u(f, -1.0f, -0.6f, 3.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(f, 12.23f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _militaryTech = build;
        build.getClass();
        return build;
    }
}
