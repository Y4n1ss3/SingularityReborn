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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ModeNightKt {
    private static ImageVector _modeNight;

    public static final ImageVector getModeNight(Icons.Rounded rounded) {
        ImageVector imageVector = _modeNight;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ModeNight", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.93f, 2.3f);
        b.curveTo(9.89f, 1.8f, 7.91f, 1.95f, 6.16f, 2.58f);
        b.curveTo(5.44f, 2.84f, 5.25f, 3.8f, 5.85f, 4.29f);
        b.curveTo(8.08f, 6.12f, 9.5f, 8.89f, 9.5f, 12.0f);
        b.curveToRelative(0.0f, 3.11f, -1.42f, 5.88f, -3.65f, 7.71f);
        b.curveToRelative(-0.59f, 0.49f, -0.42f, 1.45f, 0.31f, 1.7f);
        b.curveTo(7.2f, 21.79f, 8.33f, 22.0f, 9.5f, 22.0f);
        b.curveToRelative(6.05f, 0.0f, 10.85f, -5.38f, 9.87f, -11.6f);
        b.curveTo(18.76f, 6.48f, 15.78f, 3.24f, 11.93f, 2.3f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _modeNight = build;
        build.getClass();
        return build;
    }
}
