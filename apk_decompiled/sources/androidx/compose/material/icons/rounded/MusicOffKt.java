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
import defpackage.gy;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MusicOffKt {
    private static ImageVector _musicOff;

    public static final ImageVector getMusicOff(Icons.Rounded rounded) {
        ImageVector imageVector = _musicOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MusicOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = fc.c(14.0f, 9.61f, 7.0f, 2.0f);
        c.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        c.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        c.horizontalLineToRelative(-3.0f);
        c.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        uo.t(c, 3.61f, 2.0f, 2.0f);
        c.moveTo(5.12f, 3.56f);
        c.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        c.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        c.lineToRelative(8.29f, 8.3f);
        c.verticalLineToRelative(0.28f);
        c.curveToRelative(-0.94f, -0.54f, -2.1f, -0.75f, -3.33f, -0.32f);
        c.curveToRelative(-1.34f, 0.48f, -2.37f, 1.67f, -2.61f, 3.07f);
        c.curveToRelative(-0.46f, 2.74f, 1.86f, 5.08f, 4.59f, 4.65f);
        c.curveToRelative(1.96f, -0.31f, 3.35f, -2.11f, 3.35f, -4.1f);
        c.verticalLineToRelative(-1.58f);
        c.lineToRelative(5.02f, 5.02f);
        c.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        c.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(c, 5.12f, 3.56f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _musicOff = build;
        build.getClass();
        return build;
    }
}
