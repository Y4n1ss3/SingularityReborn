package androidx.compose.material.icons.filled;

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
import defpackage.j50;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MusicOffKt {
    private static ImageVector _musicOff;

    public static final ImageVector getMusicOff(Icons.Filled filled) {
        ImageVector imageVector = _musicOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.MusicOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(4.27f, 3.0f, 3.0f, 4.27f);
        i.lineToRelative(9.0f, 9.0f);
        i.verticalLineToRelative(0.28f);
        i.curveToRelative(-0.59f, -0.34f, -1.27f, -0.55f, -2.0f, -0.55f);
        i.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        i.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        i.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        i.verticalLineToRelative(-1.73f);
        i.lineTo(19.73f, 21.0f);
        r6.C(i, 21.0f, 19.73f, 4.27f, 3.0f);
        j50.y(i, 14.0f, 7.0f, 4.0f, 3.0f);
        i.horizontalLineToRelative(-6.0f);
        i.verticalLineToRelative(5.18f);
        i.lineToRelative(2.0f, 2.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _musicOff = build;
        build.getClass();
        return build;
    }
}
