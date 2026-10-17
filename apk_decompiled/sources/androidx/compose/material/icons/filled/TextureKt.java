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
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextureKt {
    private static ImageVector _texture;

    public static final ImageVector getTexture(Icons.Filled filled) {
        ImageVector imageVector = _texture;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Texture", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.51f, 3.08f, 3.08f, 19.51f);
        i.curveToRelative(0.09f, 0.34f, 0.27f, 0.65f, 0.51f, 0.9f);
        i.curveToRelative(0.25f, 0.24f, 0.56f, 0.42f, 0.9f, 0.51f);
        i.lineTo(20.93f, 4.49f);
        i.curveToRelative(-0.19f, -0.69f, -0.73f, -1.23f, -1.42f, -1.41f);
        k4.r(i, 11.88f, 3.0f, 3.0f, 11.88f);
        i.verticalLineToRelative(2.83f);
        i.lineTo(14.71f, 3.0f);
        i.horizontalLineToRelative(-2.83f);
        i.close();
        i.moveTo(5.0f, 3.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(2.0f);
        gy.B(i, 4.0f, -4.0f, 5.0f, 3.0f);
        i.moveTo(19.0f, 21.0f);
        i.curveToRelative(0.55f, 0.0f, 1.05f, -0.22f, 1.41f, -0.59f);
        i.curveToRelative(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f);
        i.verticalLineToRelative(-2.0f);
        i.lineToRelative(-4.0f, 4.0f);
        i.horizontalLineToRelative(2.0f);
        i.close();
        i.moveTo(9.29f, 21.0f);
        i.horizontalLineToRelative(2.83f);
        i.lineTo(21.0f, 12.12f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 21.0f, 9.29f, 9.29f, 21.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _texture = build;
        build.getClass();
        return build;
    }
}
