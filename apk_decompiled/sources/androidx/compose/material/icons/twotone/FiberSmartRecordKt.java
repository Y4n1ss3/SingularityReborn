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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FiberSmartRecordKt {
    private static ImageVector _fiberSmartRecord;

    public static final ImageVector getFiberSmartRecord(Icons.TwoTone twoTone) {
        ImageVector imageVector = _fiberSmartRecord;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FiberSmartRecord", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.0f, 18.0f);
        b.curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        b.reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f);
        b.reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, 2.69f, 6.0f, 6.0f, 6.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(9.0f, 20.0f);
        b2.curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f);
        b2.reflectiveCurveToRelative(-3.58f, -8.0f, -8.0f, -8.0f);
        b2.reflectiveCurveToRelative(-8.0f, 3.58f, -8.0f, 8.0f);
        b2.reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f);
        b2.close();
        b2.moveTo(9.0f, 6.0f);
        b2.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        b2.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        b2.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        b2.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        bv.v(b2, 17.0f, 4.26f, 2.09f);
        b2.curveToRelative(2.33f, 0.82f, 4.0f, 3.04f, 4.0f, 5.65f);
        b2.reflectiveCurveToRelative(-1.67f, 4.83f, -4.0f, 5.65f);
        b2.verticalLineToRelative(2.09f);
        b2.curveToRelative(3.45f, -0.89f, 6.0f, -4.01f, 6.0f, -7.74f);
        b2.curveToRelative(0.0f, -3.73f, -2.55f, -6.85f, -6.0f, -7.74f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberSmartRecord = build;
        build.getClass();
        return build;
    }
}
