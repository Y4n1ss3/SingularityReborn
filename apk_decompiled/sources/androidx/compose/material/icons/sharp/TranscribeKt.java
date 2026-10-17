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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TranscribeKt {
    private static ImageVector _transcribe;

    public static final ImageVector getTranscribe(Icons.Sharp sharp) {
        ImageVector imageVector = _transcribe;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Transcribe", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.93f, 16.0f, 1.63f, -1.63f);
        e.curveToRelative(-2.77f, -3.02f, -2.77f, -7.56f, 0.0f, -10.74f);
        e.lineTo(17.93f, 2.0f);
        e.curveTo(14.03f, 5.89f, 14.02f, 11.95f, 17.93f, 16.0f);
        e.close();
        e.moveTo(22.92f, 10.95f);
        e.curveToRelative(-0.84f, -1.18f, -0.84f, -2.71f, 0.0f, -3.89f);
        e.lineToRelative(-1.68f, -1.69f);
        e.curveToRelative(-2.02f, 2.02f, -2.02f, 5.07f, 0.0f, 7.27f);
        uo.l(e, 22.92f, 10.95f, 9.0f, 13.0f);
        e.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        e.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        e.reflectiveCurveTo(5.0f, 6.79f, 5.0f, 9.0f);
        e.curveTo(5.0f, 11.21f, 6.79f, 13.0f, 9.0f, 13.0f);
        e.close();
        e.moveTo(15.39f, 15.56f);
        e.curveTo(13.71f, 14.7f, 11.53f, 14.0f, 9.0f, 14.0f);
        e.curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
        e.curveTo(1.61f, 16.07f, 1.0f, 17.1f, 1.0f, 18.22f);
        kf0.r(e, 21.0f, 16.0f, -2.78f);
        e.curveTo(17.0f, 17.1f, 16.39f, 16.07f, 15.39f, 15.56f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _transcribe = build;
        build.getClass();
        return build;
    }
}
