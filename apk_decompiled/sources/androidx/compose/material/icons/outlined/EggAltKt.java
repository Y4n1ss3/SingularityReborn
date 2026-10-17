package androidx.compose.material.icons.outlined;

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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EggAltKt {
    private static ImageVector _eggAlt;

    public static final ImageVector getEggAlt(Icons.Outlined outlined) {
        ImageVector imageVector = _eggAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.EggAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.0f, 9.0f);
        b.curveTo(17.0f, 7.0f, 15.99f, 2.0f, 9.97f, 2.0f);
        b.curveTo(4.95f, 2.0f, 1.94f, 6.0f, 2.0f, 11.52f);
        b.curveTo(2.06f, 17.04f, 6.96f, 19.0f, 9.97f, 19.0f);
        b.curveToRelative(2.01f, 0.0f, 2.01f, 3.0f, 6.02f, 3.0f);
        b.curveTo(19.0f, 22.0f, 22.0f, 19.0f, 22.0f, 15.02f);
        b.curveTo(22.0f, 12.0f, 21.01f, 11.0f, 19.0f, 9.0f);
        b.close();
        b.moveTo(15.99f, 20.0f);
        b.curveToRelative(-1.49f, 0.0f, -1.96f, -0.5f, -2.68f, -1.26f);
        b.curveTo(12.66f, 18.05f, 11.66f, 17.0f, 9.97f, 17.0f);
        b.curveTo(8.33f, 17.0f, 4.05f, 16.01f, 4.0f, 11.5f);
        b.curveTo(3.97f, 8.99f, 4.68f, 6.88f, 5.99f, 5.55f);
        b.curveTo(7.01f, 4.52f, 8.35f, 4.0f, 9.97f, 4.0f);
        b.curveToRelative(3.34f, 0.0f, 4.51f, 1.86f, 5.86f, 4.02f);
        b.curveToRelative(0.55f, 0.88f, 1.07f, 1.71f, 1.76f, 2.39f);
        b.curveToRelative(1.9f, 1.89f, 2.41f, 2.4f, 2.41f, 4.61f);
        b.curveTo(20.0f, 17.87f, 17.88f, 20.0f, 15.99f, 20.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = af0.b(12.0f, 12.0f, -3.5f, 0.0f);
        b2.arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f);
        b2.arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _eggAlt = build;
        build.getClass();
        return build;
    }
}
