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
import defpackage.af0;
import defpackage.fc;
import defpackage.gy;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EmojiFlagsKt {
    private static ImageVector _emojiFlags;

    public static final ImageVector getEmojiFlags(Icons.Rounded rounded) {
        ImageVector imageVector = _emojiFlags;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EmojiFlags", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(19.0f, 9.0f, -5.0f, -0.72f, -1.45f);
        i.curveTo(13.11f, 7.21f, 12.76f, 7.0f, 12.38f, 7.0f);
        i.horizontalLineTo(7.0f);
        i.verticalLineTo(5.72f);
        i.curveTo(7.6f, 5.38f, 8.0f, 4.74f, 8.0f, 4.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.reflectiveCurveTo(4.0f, 2.9f, 4.0f, 4.0f);
        i.curveToRelative(0.0f, 0.74f, 0.4f, 1.38f, 1.0f, 1.72f);
        i.verticalLineTo(20.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        gy.C(i, -3.0f, 5.0f, 0.72f, 1.45f);
        i.curveToRelative(0.17f, 0.34f, 0.52f, 0.55f, 0.89f, 0.55f);
        i.horizontalLineTo(19.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        i.verticalLineToRelative(-8.0f);
        i.curveTo(20.0f, 9.45f, 19.55f, 9.0f, 19.0f, 9.0f);
        af0.l(i, 18.0f, 17.0f, -4.0f);
        kp0.v(i, -1.0f, -2.0f, 7.0f, 9.0f);
        kf0.B(i, 5.0f, 1.0f, 2.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(i, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emojiFlags = build;
        build.getClass();
        return build;
    }
}
