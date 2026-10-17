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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EmojiObjectsKt {
    private static ImageVector _emojiObjects;

    public static final ImageVector getEmojiObjects(Icons.Rounded rounded) {
        ImageVector imageVector = _emojiObjects;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EmojiObjects", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 3.0f);
        b.curveToRelative(-0.46f, 0.0f, -0.93f, 0.04f, -1.4f, 0.14f);
        b.curveTo(7.84f, 3.67f, 5.64f, 5.9f, 5.12f, 8.66f);
        b.curveToRelative(-0.48f, 2.61f, 0.48f, 5.01f, 2.22f, 6.56f);
        b.curveTo(7.77f, 15.6f, 8.0f, 16.13f, 8.0f, 16.69f);
        b.verticalLineTo(19.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(0.28f);
        b.curveToRelative(0.35f, 0.6f, 0.98f, 1.0f, 1.72f, 1.0f);
        b.reflectiveCurveToRelative(1.38f, -0.4f, 1.72f, -1.0f);
        b.horizontalLineTo(14.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineToRelative(-2.31f);
        b.curveToRelative(0.0f, -0.55f, 0.22f, -1.09f, 0.64f, -1.46f);
        b.curveTo(18.09f, 13.95f, 19.0f, 12.08f, 19.0f, 10.0f);
        b.curveTo(19.0f, 6.13f, 15.87f, 3.0f, 12.0f, 3.0f);
        r6.B(b, 12.5f, 14.0f, -1.0f, -2.59f);
        b.lineTo(9.67f, 9.59f);
        b.lineToRelative(0.71f, -0.71f);
        b.lineTo(12.0f, 10.5f);
        b.lineToRelative(1.62f, -1.62f);
        b.lineToRelative(0.71f, 0.71f);
        uf.x(b, -1.83f, 1.83f, 14.0f);
        b.moveTo(13.5f, 19.0f);
        b.curveToRelative(-0.01f, 0.0f, -0.02f, -0.01f, -0.03f, -0.01f);
        kf0.r(b, 19.0f, -2.94f, -0.01f);
        b.curveToRelative(-0.01f, 0.0f, -0.02f, 0.01f, -0.03f, 0.01f);
        b.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        b.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        b.curveToRelative(0.01f, 0.0f, 0.02f, 0.01f, 0.03f, 0.01f);
        kf0.r(b, 18.0f, 2.94f, 0.01f);
        b.curveToRelative(0.01f, 0.0f, 0.02f, -0.01f, 0.03f, -0.01f);
        b.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        b.curveTo(14.0f, 18.78f, 13.78f, 19.0f, 13.5f, 19.0f);
        af0.l(b, 13.5f, 17.0f, -3.0f);
        b.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        b.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        b.horizontalLineToRelative(3.0f);
        b.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        b.curveTo(14.0f, 16.78f, 13.78f, 17.0f, 13.5f, 17.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emojiObjects = build;
        build.getClass();
        return build;
    }
}
