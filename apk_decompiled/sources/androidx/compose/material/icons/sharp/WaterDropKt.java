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
import defpackage.fc;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WaterDropKt {
    private static ImageVector _waterDrop;

    public static final ImageVector getWaterDrop(Icons.Sharp sharp) {
        ImageVector imageVector = _waterDrop;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.WaterDrop", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveToRelative(-5.33f, 4.55f, -8.0f, 8.48f, -8.0f, 11.8f);
        b.curveToRelative(0.0f, 4.98f, 3.8f, 8.2f, 8.0f, 8.2f);
        b.reflectiveCurveToRelative(8.0f, -3.22f, 8.0f, -8.2f);
        b.curveTo(20.0f, 10.48f, 17.33f, 6.55f, 12.0f, 2.0f);
        b.close();
        b.moveTo(13.0f, 18.91f);
        b.curveTo(12.68f, 18.97f, 12.35f, 19.0f, 12.0f, 19.0f);
        b.curveToRelative(-2.69f, 0.0f, -4.88f, -1.94f, -5.0f, -5.0f);
        b.horizontalLineToRelative(1.5f);
        b.curveToRelative(0.08f, 2.07f, 1.5f, 3.5f, 3.5f, 3.5f);
        b.curveToRelative(0.35f, 0.0f, 0.69f, -0.04f, 1.0f, -0.13f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 18.91f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _waterDrop = build;
        build.getClass();
        return build;
    }
}
