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
import defpackage.fc;
import defpackage.gy;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FilterListOffKt {
    private static ImageVector _filterListOff;

    public static final ImageVector getFilterListOff(Icons.Rounded rounded) {
        ImageVector imageVector = _filterListOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FilterListOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.0f, 7.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        fc.z(b, 8.83f, 2.0f, 2.0f, 20.0f);
        b.curveTo(20.55f, 8.0f, 21.0f, 7.55f, 21.0f, 7.0f);
        b.close();
        b.moveTo(18.0f, 12.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        r6.t(b, -3.17f, 2.0f, 2.0f, 17.0f);
        b.curveTo(17.55f, 13.0f, 18.0f, 12.55f, 18.0f, 12.0f);
        b.close();
        b.moveTo(13.98f, 16.81f);
        b.curveTo(13.99f, 16.87f, 14.0f, 16.94f, 14.0f, 17.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineToRelative(-2.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(0.06f, 0.0f, 0.13f, 0.01f, 0.19f, 0.02f);
        b.lineTo(10.17f, 13.0f);
        b.horizontalLineTo(7.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        r6.t(b, 1.17f, -3.0f, -3.0f, 4.0f);
        b.curveTo(3.45f, 8.0f, 3.0f, 7.55f, 3.0f, 7.0f);
        b.curveToRelative(0.0f, -0.32f, 0.15f, -0.6f, 0.38f, -0.79f);
        b.lineTo(2.1f, 4.93f);
        b.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        b.reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0.0f);
        b.lineToRelative(16.97f, 16.97f);
        b.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        b.reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 13.98f, 16.81f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _filterListOff = build;
        build.getClass();
        return build;
    }
}
