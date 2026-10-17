package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class YoutubeSearchedForKt {
    private static ImageVector _youtubeSearchedFor;

    public static final ImageVector getYoutubeSearchedFor(Icons.TwoTone twoTone) {
        ImageVector imageVector = _youtubeSearchedFor;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.YoutubeSearchedFor", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(17.01f, 14.0f, -0.8f, -0.27f, -0.27f);
        i.curveToRelative(0.98f, -1.14f, 1.57f, -2.61f, 1.57f, -4.23f);
        i.curveToRelative(0.0f, -3.59f, -2.91f, -6.5f, -6.5f, -6.5f);
        i.reflectiveCurveToRelative(-6.5f, 3.0f, -6.5f, 6.5f);
        i.horizontalLineTo(2.0f);
        i.lineToRelative(3.84f, 4.0f);
        i.lineToRelative(4.16f, -4.0f);
        i.horizontalLineTo(6.51f);
        i.curveTo(6.51f, 7.0f, 8.53f, 5.0f, 11.01f, 5.0f);
        i.reflectiveCurveToRelative(4.5f, 2.01f, 4.5f, 4.5f);
        i.curveToRelative(0.0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f);
        i.curveToRelative(-0.65f, 0.0f, -1.26f, -0.14f, -1.82f, -0.38f);
        i.lineTo(7.71f, 15.1f);
        i.curveToRelative(0.97f, 0.57f, 2.09f, 0.9f, 3.3f, 0.9f);
        i.curveToRelative(1.61f, 0.0f, 3.08f, -0.59f, 4.22f, -1.57f);
        i.lineToRelative(0.27f, 0.27f);
        i.verticalLineToRelative(0.79f);
        i.lineToRelative(5.01f, 4.99f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(i, 22.0f, 19.0f, -4.99f, -5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _youtubeSearchedFor = build;
        build.getClass();
        return build;
    }
}
