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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ElectricBoltKt {
    private static ImageVector _electricBolt;

    public static final ImageVector getElectricBolt(Icons.Outlined outlined) {
        ImageVector imageVector = _electricBolt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ElectricBolt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(14.69f, 2.21f, 4.33f, 11.49f);
        i.curveToRelative(-0.64f, 0.58f, -0.28f, 1.65f, 0.58f, 1.73f);
        i.lineTo(13.0f, 14.0f);
        i.lineToRelative(-4.85f, 6.76f);
        i.curveToRelative(-0.22f, 0.31f, -0.19f, 0.74f, 0.08f, 1.01f);
        i.horizontalLineToRelative(0.0f);
        i.curveToRelative(0.3f, 0.3f, 0.77f, 0.31f, 1.08f, 0.02f);
        i.lineToRelative(10.36f, -9.28f);
        i.curveToRelative(0.64f, -0.58f, 0.28f, -1.65f, -0.58f, -1.73f);
        i.lineTo(11.0f, 10.0f);
        i.lineToRelative(4.85f, -6.76f);
        i.curveToRelative(0.22f, -0.31f, 0.19f, -0.74f, -0.08f, -1.01f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveTo(15.47f, 1.93f, 15.0f, 1.92f, 14.69f, 2.21f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _electricBolt = build;
        build.getClass();
        return build;
    }
}
