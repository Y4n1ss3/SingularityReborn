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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextureKt {
    private static ImageVector _texture;

    public static final ImageVector getTexture(Icons.Sharp sharp) {
        ImageVector imageVector = _texture;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Texture", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.66f, 3.0f, 3.07f, 19.59f);
        i.lineTo(3.07f, 21.0f);
        i.horizontalLineToRelative(1.41f);
        r6.C(i, 21.07f, 4.42f, 21.07f, 3.0f);
        i.moveTo(11.95f, 3.0f);
        i.lineToRelative(-8.88f, 8.88f);
        kf0.t(i, 2.83f, 14.78f, 3.0f);
        i.moveTo(3.07f, 3.0f);
        uo.t(i, 4.0f, 4.0f, -4.0f);
        i.moveTo(21.07f, 21.0f);
        uo.t(i, -4.0f, -4.0f, 4.0f);
        i.moveTo(12.19f, 21.0f);
        i.lineToRelative(8.88f, -8.88f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 21.07f, 9.29f, 9.36f, 21.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _texture = build;
        build.getClass();
        return build;
    }
}
