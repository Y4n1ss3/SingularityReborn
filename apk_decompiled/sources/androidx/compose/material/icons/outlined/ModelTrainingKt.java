package androidx.compose.material.icons.outlined;

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
import defpackage.bv;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ModelTrainingKt {
    private static ImageVector _modelTraining;

    public static final ImageVector getModelTraining(Icons.Outlined outlined) {
        ImageVector imageVector = _modelTraining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ModelTraining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.5f, 13.5f);
        b.curveToRelative(0.0f, 2.0f, -2.5f, 3.5f, -2.5f, 5.0f);
        b.horizontalLineToRelative(-2.0f);
        b.curveToRelative(0.0f, -1.5f, -2.5f, -3.0f, -2.5f, -5.0f);
        b.curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f);
        b.horizontalLineToRelative(0.0f);
        b.curveTo(13.93f, 10.0f, 15.5f, 11.57f, 15.5f, 13.5f);
        af0.r(b, 13.0f, 19.5f, -2.0f, 21.0f);
        uo.r(b, 2.0f, 19.5f, 19.0f, 13.0f);
        b.curveToRelative(0.0f, 1.68f, -0.59f, 3.21f, -1.58f, 4.42f);
        b.lineToRelative(1.42f, 1.42f);
        b.curveTo(20.18f, 17.27f, 21.0f, 15.23f, 21.0f, 13.0f);
        b.curveToRelative(0.0f, -2.74f, -1.23f, -5.19f, -3.16f, -6.84f);
        b.lineToRelative(-1.42f, 1.42f);
        b.curveTo(17.99f, 8.86f, 19.0f, 10.82f, 19.0f, 13.0f);
        k4.x(b, 16.0f, 5.0f, -4.0f, -4.0f);
        b.verticalLineToRelative(3.0f);
        b.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        b.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        b.curveToRelative(0.0f, 2.23f, 0.82f, 4.27f, 2.16f, 5.84f);
        b.lineToRelative(1.42f, -1.42f);
        b.curveTo(5.59f, 16.21f, 5.0f, 14.68f, 5.0f, 13.0f);
        b.curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f);
        b.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.j(b, 3.0f, 16.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _modelTraining = build;
        build.getClass();
        return build;
    }
}
