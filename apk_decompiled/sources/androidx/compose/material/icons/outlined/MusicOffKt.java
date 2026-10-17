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
import defpackage.gy;
import defpackage.j50;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MusicOffKt {
    private static ImageVector _musicOff;

    public static final ImageVector getMusicOff(Icons.Outlined outlined) {
        ImageVector imageVector = _musicOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MusicOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(14.0f, 7.0f, 4.0f, 18.0f, 3.0f);
        j50.u(p, -6.0f, 4.61f, 2.0f, 2.0f);
        p.moveTo(12.0f, 10.44f);
        p.lineTo(4.41f, 2.86f);
        p.lineTo(3.0f, 4.27f);
        p.lineToRelative(9.0f, 9.0f);
        p.verticalLineToRelative(0.28f);
        p.curveToRelative(-0.94f, -0.54f, -2.1f, -0.75f, -3.33f, -0.32f);
        p.curveToRelative(-1.34f, 0.48f, -2.37f, 1.67f, -2.61f, 3.07f);
        p.curveToRelative(-0.46f, 2.74f, 1.86f, 5.08f, 4.59f, 4.65f);
        p.curveToRelative(1.96f, -0.31f, 3.35f, -2.11f, 3.35f, -4.1f);
        p.verticalLineToRelative(-1.58f);
        p.lineTo(19.73f, 21.0f);
        gy.B(p, 1.41f, -1.41f, 12.0f, 10.44f);
        p.moveTo(10.0f, 19.0f);
        p.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        p.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        p.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(p, -0.9f, 2.0f, -2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _musicOff = build;
        build.getClass();
        return build;
    }
}
