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
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ThumbDownOffAltKt {
    private static ImageVector _thumbDownOffAlt;

    public static final ImageVector getThumbDownOffAlt(Icons.Sharp sharp) {
        ImageVector imageVector = _thumbDownOffAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ThumbDownOffAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(19.0f, 3.0f, 4.0f, 12.0f, -4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = fc.c(1.0f, 11.6f, 16.0f, 8.31f);
        c.lineToRelative(-1.12f, 5.38f);
        c.lineTo(9.83f, 23.0f);
        uf.u(c, 17.0f, 15.82f, 3.0f, 4.69f);
        uo.l(c, 1.0f, 11.6f, 15.0f, 5.0f);
        c.verticalLineToRelative(9.99f);
        c.lineToRelative(-4.34f, 4.35f);
        c.lineToRelative(0.61f, -2.93f);
        c.lineToRelative(0.5f, -2.41f);
        c.horizontalLineTo(9.31f);
        c.horizontalLineTo(3.0f);
        c.verticalLineToRelative(-1.99f);
        c.lineTo(6.01f, 5.0f);
        c.horizontalLineTo(15.0f);
        c.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbDownOffAlt = build;
        build.getClass();
        return build;
    }
}
