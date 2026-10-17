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
import defpackage.bv;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DataExplorationKt {
    private static ImageVector _dataExploration;

    public static final ImageVector getDataExploration(Icons.Rounded rounded) {
        ImageVector imageVector = _dataExploration;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DataExploration", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(22.0f, 12.0f);
        b.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        b.reflectiveCurveTo(2.0f, 6.48f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 1.33f, 0.26f, 2.61f, 0.74f, 3.77f);
        b.lineToRelative(4.61f, -4.62f);
        b.curveToRelative(0.37f, -0.37f, 0.95f, -0.39f, 1.35f, -0.06f);
        b.lineToRelative(2.6f, 2.19f);
        b.lineTo(14.58f, 10.0f);
        b.horizontalLineTo(14.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(3.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(3.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineToRelative(-0.58f);
        b.lineToRelative(-3.94f, 3.93f);
        b.curveToRelative(-0.37f, 0.37f, -0.96f, 0.39f, -1.35f, 0.05f);
        b.lineToRelative(-2.59f, -2.19f);
        b.lineToRelative(-4.4f, 4.4f);
        b.curveTo(5.52f, 20.26f, 8.56f, 22.0f, 12.0f, 22.0f);
        b.horizontalLineToRelative(8.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        bv.t(b, 12.0f, 19.5f, 20.5f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 20.05f, 20.5f, 19.5f, 20.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dataExploration = build;
        build.getClass();
        return build;
    }
}
