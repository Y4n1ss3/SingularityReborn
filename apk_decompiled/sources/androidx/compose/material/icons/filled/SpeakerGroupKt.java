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
import defpackage.j50;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SpeakerGroupKt {
    private static ImageVector _speakerGroup;

    public static final ImageVector getSpeakerGroup(Icons.Filled filled) {
        ImageVector imageVector = _speakerGroup;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SpeakerGroup", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(18.2f, 1.0f, 9.8f, 1.0f);
        i.curveTo(8.81f, 1.0f, 8.0f, 1.81f, 8.0f, 2.8f);
        i.verticalLineToRelative(14.4f);
        i.curveToRelative(0.0f, 0.99f, 0.81f, 1.79f, 1.8f, 1.79f);
        i.lineToRelative(8.4f, 0.01f);
        i.curveToRelative(0.99f, 0.0f, 1.8f, -0.81f, 1.8f, -1.8f);
        i.lineTo(20.0f, 2.8f);
        i.curveToRelative(0.0f, -0.99f, -0.81f, -1.8f, -1.8f, -1.8f);
        i.close();
        i.moveTo(14.0f, 3.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
        i.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        i.reflectiveCurveToRelative(-2.0f, -0.89f, -2.0f, -2.0f);
        i.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        i.close();
        i.moveTo(14.0f, 16.5f);
        i.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        i.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        i.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -1.79f, 4.0f, -4.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(14.0f, 12.5f, -2.5f, 0.0f);
        b.arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f);
        b.arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder q = j50.q(6.0f, 5.0f, 4.0f, 16.0f);
        q.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.s(q, 10.0f, -2.0f, 6.0f, 5.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _speakerGroup = build;
        build.getClass();
        return build;
    }
}
