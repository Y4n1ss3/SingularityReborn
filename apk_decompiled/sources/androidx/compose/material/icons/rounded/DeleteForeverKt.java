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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DeleteForeverKt {
    private static ImageVector _deleteForever;

    public static final ImageVector getDeleteForever(Icons.Rounded rounded) {
        ImageVector imageVector = _deleteForever;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DeleteForever", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(6.0f, 19.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(8.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        k4.t(b, 7.0f, 6.0f, 19.0f);
        b.moveTo(9.17f, 12.59f);
        b.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        b.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        b.lineTo(12.0f, 12.59f);
        b.lineToRelative(1.41f, -1.41f);
        b.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        b.reflectiveCurveToRelative(0.39f, 1.02f, 0.0f, 1.41f);
        b.lineTo(13.41f, 14.0f);
        b.lineToRelative(1.41f, 1.41f);
        b.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        b.reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0.0f);
        b.lineTo(12.0f, 15.41f);
        b.lineToRelative(-1.41f, 1.41f);
        b.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        b.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        r6.C(b, 10.59f, 14.0f, 9.17f, 12.59f);
        b.moveTo(18.0f, 4.0f);
        b.horizontalLineToRelative(-2.5f);
        b.lineToRelative(-0.71f, -0.71f);
        b.curveTo(14.61f, 3.11f, 14.35f, 3.0f, 14.09f, 3.0f);
        b.horizontalLineTo(9.91f);
        b.curveToRelative(-0.26f, 0.0f, -0.52f, 0.11f, -0.7f, 0.29f);
        b.lineTo(8.5f, 4.0f);
        b.horizontalLineTo(6.0f);
        b.curveTo(5.45f, 4.0f, 5.0f, 4.45f, 5.0f, 5.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(12.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 18.55f, 4.0f, 18.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _deleteForever = build;
        build.getClass();
        return build;
    }
}
