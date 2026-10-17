package androidx.compose.material.icons.rounded;

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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FiberSmartRecordKt {
    private static ImageVector _fiberSmartRecord;

    public static final ImageVector getFiberSmartRecord(Icons.Rounded rounded) {
        ImageVector imageVector = _fiberSmartRecord;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FiberSmartRecord", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(9.0f, 12.0f, -8.0f, 0.0f);
        b.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f);
        b.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(17.0f, 5.55f, 0.18f);
        h.curveToRelative(0.0f, 0.37f, 0.23f, 0.69f, 0.57f, 0.85f);
        h.curveTo(19.6f, 7.54f, 21.0f, 9.61f, 21.0f, 12.0f);
        h.reflectiveCurveToRelative(-1.4f, 4.46f, -3.43f, 5.42f);
        h.curveToRelative(-0.34f, 0.16f, -0.57f, 0.47f, -0.57f, 0.84f);
        h.verticalLineToRelative(0.18f);
        h.curveToRelative(0.0f, 0.68f, 0.71f, 1.11f, 1.32f, 0.82f);
        h.curveTo(21.08f, 18.01f, 23.0f, 15.23f, 23.0f, 12.0f);
        h.reflectiveCurveToRelative(-1.92f, -6.01f, -4.68f, -7.27f);
        h.curveToRelative(-0.61f, -0.28f, -1.32f, 0.14f, -1.32f, 0.82f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberSmartRecord = build;
        build.getClass();
        return build;
    }
}
