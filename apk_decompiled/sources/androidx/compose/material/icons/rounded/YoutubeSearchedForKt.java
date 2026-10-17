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
import defpackage.gy;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class YoutubeSearchedForKt {
    private static ImageVector _youtubeSearchedFor;

    public static final ImageVector getYoutubeSearchedFor(Icons.Rounded rounded) {
        ImageVector imageVector = _youtubeSearchedFor;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.YoutubeSearchedFor", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(17.01f, 14.0f, -0.8f, -0.27f, -0.27f);
        i.curveToRelative(1.15f, -1.34f, 1.76f, -3.14f, 1.51f, -5.09f);
        i.curveTo(17.11f, 6.0f, 15.1f, 3.78f, 12.5f, 3.18f);
        i.curveTo(8.26f, 2.2f, 4.51f, 5.53f, 4.51f, 9.5f);
        i.horizontalLineToRelative(-2.1f);
        i.curveToRelative(-0.47f, 0.0f, -0.68f, 0.59f, -0.31f, 0.89f);
        i.lineToRelative(3.4f, 2.75f);
        i.curveToRelative(0.19f, 0.2f, 0.51f, 0.21f, 0.71f, 0.01f);
        i.lineToRelative(2.9f, -2.79f);
        i.curveToRelative(0.32f, -0.31f, 0.1f, -0.86f, -0.35f, -0.86f);
        i.horizontalLineTo(6.51f);
        i.curveToRelative(0.0f, -2.49f, 2.0f, -4.48f, 4.46f, -4.5f);
        i.curveToRelative(2.44f, -0.02f, 4.54f, 2.05f, 4.54f, 4.49f);
        i.curveToRelative(0.0f, 2.48f, -2.02f, 4.51f, -4.5f, 4.51f);
        i.curveToRelative(-0.45f, 0.0f, -0.89f, -0.07f, -1.3f, -0.19f);
        i.curveToRelative(-0.34f, -0.1f, -0.71f, 0.0f, -0.96f, 0.26f);
        i.curveToRelative(-0.53f, 0.53f, -0.32f, 1.45f, 0.39f, 1.66f);
        i.curveToRelative(0.59f, 0.17f, 1.22f, 0.27f, 1.87f, 0.27f);
        i.curveToRelative(1.61f, 0.0f, 3.08f, -0.59f, 4.22f, -1.57f);
        i.lineToRelative(0.27f, 0.27f);
        i.verticalLineToRelative(0.79f);
        i.lineToRelative(4.27f, 4.25f);
        i.curveToRelative(0.41f, 0.41f, 1.07f, 0.41f, 1.48f, 0.0f);
        i.curveToRelative(0.41f, -0.41f, 0.41f, -1.08f, 0.0f, -1.49f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 17.01f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _youtubeSearchedFor = build;
        build.getClass();
        return build;
    }
}
