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
import defpackage.fc;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MusicOffKt {
    private static ImageVector _musicOff;

    public static final ImageVector getMusicOff(Icons.Sharp sharp) {
        ImageVector imageVector = _musicOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MusicOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = uf.c(14.0f, 9.61f, 7.0f, 4.0f, 3.0f);
        fc.x(c, -6.0f, 4.61f, 4.41f, 2.86f);
        c.lineTo(3.0f, 4.27f);
        c.lineToRelative(9.0f, 9.0f);
        c.verticalLineToRelative(0.28f);
        c.curveToRelative(-0.94f, -0.54f, -2.1f, -0.75f, -3.33f, -0.32f);
        c.curveToRelative(-1.34f, 0.48f, -2.37f, 1.67f, -2.61f, 3.07f);
        c.curveToRelative(-0.46f, 2.74f, 1.86f, 5.08f, 4.59f, 4.65f);
        c.curveToRelative(1.96f, -0.31f, 3.35f, -2.11f, 3.35f, -4.1f);
        c.verticalLineToRelative(-1.58f);
        c.lineTo(19.73f, 21.0f);
        c.lineToRelative(1.41f, -1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(c, 12.0f, 10.44f, 4.41f, 2.86f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _musicOff = build;
        build.getClass();
        return build;
    }
}
