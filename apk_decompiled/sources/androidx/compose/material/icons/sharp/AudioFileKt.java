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
import defpackage.c21;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AudioFileKt {
    private static ImageVector _audioFile;

    public static final ImageVector getAudioFile(Icons.Sharp sharp) {
        ImageVector imageVector = _audioFile;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AudioFile", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(14.0f, 2.0f, 4.0f, 20.0f, 16.0f);
        bv.k(i, 8.0f, 14.0f, 2.0f);
        k4.C(i, 16.0f, 13.0f, -3.0f, 3.75f);
        i.curveToRelative(0.0f, 1.24f, -1.01f, 2.25f, -2.25f, 2.25f);
        i.reflectiveCurveTo(8.5f, 17.99f, 8.5f, 16.75f);
        i.curveToRelative(0.0f, -1.24f, 1.01f, -2.25f, 2.25f, -2.25f);
        i.curveToRelative(0.46f, 0.0f, 0.89f, 0.14f, 1.25f, 0.38f);
        c21.c(i, 11.0f, 4.0f, 13.0f);
        i.moveTo(13.0f, 9.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c21.b(i, 3.5f, 18.5f, 9.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _audioFile = build;
        build.getClass();
        return build;
    }
}
