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
import defpackage.bv;
import defpackage.c21;
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AudioFileKt {
    private static ImageVector _audioFile;

    public static final ImageVector getAudioFile(Icons.TwoTone twoTone) {
        ImageVector imageVector = _audioFile;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AudioFile", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(13.0f, 4.0f, 6.0f, 16.0f, 12.0f);
        c21.c(i, 9.0f, -5.0f, 4.0f);
        bv.y(i, 16.0f, 11.0f, 2.0f, -3.0f);
        i.verticalLineToRelative(3.75f);
        i.curveToRelative(0.0f, 1.24f, -1.01f, 2.25f, -2.25f, 2.25f);
        i.reflectiveCurveTo(8.5f, 17.99f, 8.5f, 16.75f);
        i.curveToRelative(0.0f, -1.24f, 1.01f, -2.25f, 2.25f, -2.25f);
        i.curveToRelative(0.46f, 0.0f, 0.89f, 0.14f, 1.25f, 0.38f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.e(i, 11.0f, 16.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(14.0f, 2.0f, 6.0f);
        d.curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f);
        d.verticalLineToRelative(16.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(12.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        bv.k(d, 8.0f, 14.0f, 2.0f);
        uo.p(d, 18.0f, 20.0f, 6.0f, 4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(d, 7.0f, 5.0f, 5.0f, 20.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 14.88f);
        b.curveToRelative(-0.36f, -0.24f, -0.79f, -0.38f, -1.25f, -0.38f);
        b.curveToRelative(-1.24f, 0.0f, -2.25f, 1.01f, -2.25f, 2.25f);
        b.curveToRelative(0.0f, 1.24f, 1.01f, 2.25f, 2.25f, 2.25f);
        b.reflectiveCurveTo(13.0f, 17.99f, 13.0f, 16.75f);
        uf.p(b, 13.0f, 3.0f, -2.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 14.88f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _audioFile = build;
        build.getClass();
        return build;
    }
}
