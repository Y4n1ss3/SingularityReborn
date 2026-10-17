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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextureKt {
    private static ImageVector _texture;

    public static final ImageVector getTexture(Icons.TwoTone twoTone) {
        ImageVector imageVector = _texture;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Texture", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(11.88f, 3.0f, 3.0f, 11.88f, 2.83f);
        uo.l(s, 14.71f, 3.0f, 3.0f, 5.0f);
        s.verticalLineToRelative(2.0f);
        s.lineToRelative(4.0f, -4.0f);
        s.lineTo(5.0f, 3.0f);
        s.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        k4.r(s, 19.51f, 3.08f, 3.08f, 19.51f);
        s.curveToRelative(0.09f, 0.34f, 0.27f, 0.65f, 0.51f, 0.9f);
        s.curveToRelative(0.25f, 0.24f, 0.56f, 0.42f, 0.9f, 0.51f);
        s.lineTo(20.93f, 4.49f);
        s.curveToRelative(-0.19f, -0.69f, -0.73f, -1.23f, -1.42f, -1.41f);
        k4.r(s, 21.0f, 9.29f, 9.29f, 21.0f);
        gy.n(s, 2.83f, 21.0f, 12.12f);
        s.moveTo(20.41f, 20.41f);
        s.curveToRelative(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f);
        r6.h(s, -2.0f, -4.0f, 4.0f, 2.0f);
        s.curveToRelative(0.55f, 0.0f, 1.05f, -0.22f, 1.41f, -0.59f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _texture = build;
        build.getClass();
        return build;
    }
}
