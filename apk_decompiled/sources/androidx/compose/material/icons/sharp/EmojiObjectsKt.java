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
import defpackage.bv;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EmojiObjectsKt {
    private static ImageVector _emojiObjects;

    public static final ImageVector getEmojiObjects(Icons.Sharp sharp) {
        ImageVector imageVector = _emojiObjects;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.EmojiObjects", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 3.0f);
        b.curveToRelative(-0.42f, 0.0f, -0.85f, 0.04f, -1.28f, 0.11f);
        b.curveToRelative(-2.81f, 0.5f, -5.08f, 2.75f, -5.6f, 5.55f);
        b.curveToRelative(-0.48f, 2.61f, 0.48f, 5.01f, 2.22f, 6.56f);
        b.curveTo(7.77f, 15.6f, 8.0f, 16.13f, 8.0f, 16.69f);
        b.curveTo(8.0f, 18.21f, 8.0f, 21.0f, 8.0f, 21.0f);
        b.horizontalLineToRelative(2.28f);
        b.curveToRelative(0.35f, 0.6f, 0.98f, 1.0f, 1.72f, 1.0f);
        b.reflectiveCurveToRelative(1.38f, -0.4f, 1.72f, -1.0f);
        b.horizontalLineTo(16.0f);
        b.verticalLineToRelative(-4.31f);
        b.curveToRelative(0.0f, -0.55f, 0.22f, -1.09f, 0.64f, -1.46f);
        b.curveTo(18.09f, 13.95f, 19.0f, 12.08f, 19.0f, 10.0f);
        b.curveTo(19.0f, 6.13f, 15.87f, 3.0f, 12.0f, 3.0f);
        r6.B(b, 14.0f, 19.0f, -4.0f, -1.0f);
        uo.r(b, 4.0f, 19.0f, 14.0f, 17.0f);
        bv.l(b, -4.0f, -1.0f, 4.0f, 17.0f);
        kp0.t(b, 12.5f, 11.41f, 14.0f, -1.0f);
        b.verticalLineToRelative(-2.59f);
        b.lineTo(9.67f, 9.59f);
        b.lineToRelative(0.71f, -0.71f);
        b.lineTo(12.0f, 10.5f);
        b.lineToRelative(1.62f, -1.62f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 0.71f, 0.71f, 12.5f, 11.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emojiObjects = build;
        build.getClass();
        return build;
    }
}
