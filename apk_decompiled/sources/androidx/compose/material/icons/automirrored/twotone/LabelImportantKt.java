package androidx.compose.material.icons.automirrored.twotone;

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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LabelImportantKt {
    private static ImageVector _labelImportant;

    public static final ImageVector getLabelImportant(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector imageVector = _labelImportant;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.LabelImportant", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = r6.a(15.0f, 7.0f, 7.89f, 3.57f, 5.0f);
        a.lineToRelative(-3.57f, 5.0f);
        a.horizontalLineTo(15.0f);
        a.lineToRelative(3.55f, -5.0f);
        a.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.63f, 5.84f);
        b.curveTo(16.27f, 5.33f, 15.67f, 5.0f, 15.0f, 5.0f);
        b.horizontalLineTo(4.0f);
        b.lineToRelative(5.0f, 7.0f);
        b.lineToRelative(-5.0f, 6.99f);
        b.horizontalLineToRelative(11.0f);
        b.curveToRelative(0.67f, 0.0f, 1.27f, -0.32f, 1.63f, -0.83f);
        bv.o(b, 21.0f, 12.0f, -4.37f, -6.16f);
        b.moveTo(15.0f, 17.0f);
        b.horizontalLineTo(7.89f);
        b.lineToRelative(3.57f, -5.0f);
        b.lineToRelative(-3.57f, -5.0f);
        b.horizontalLineTo(15.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 3.55f, 5.0f, 15.0f, 17.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _labelImportant = build;
        build.getClass();
        return build;
    }
}
