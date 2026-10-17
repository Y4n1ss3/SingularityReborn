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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GroupRemoveKt {
    private static ImageVector _groupRemove;

    public static final ImageVector getGroupRemove(Icons.Rounded rounded) {
        ImageVector imageVector = _groupRemove;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.GroupRemove", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.0f, 10.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(4.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineToRelative(-4.0f);
        b.curveTo(18.45f, 11.0f, 18.0f, 10.55f, 18.0f, 10.0f);
        b.close();
        b.moveTo(8.0f, 4.0f);
        b.curveTo(5.79f, 4.0f, 4.0f, 5.79f, 4.0f, 8.0f);
        b.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        b.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        b.reflectiveCurveTo(10.21f, 4.0f, 8.0f, 4.0f);
        b.close();
        b.moveTo(8.0f, 13.0f);
        b.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        kf0.z(b, 3.0f, 16.0f, -3.0f);
        b.curveTo(16.0f, 14.34f, 10.67f, 13.0f, 8.0f, 13.0f);
        b.close();
        b.moveTo(12.51f, 4.05f);
        b.curveTo(13.43f, 5.11f, 14.0f, 6.49f, 14.0f, 8.0f);
        b.reflectiveCurveToRelative(-0.57f, 2.89f, -1.49f, 3.95f);
        b.curveTo(14.47f, 11.7f, 16.0f, 10.04f, 16.0f, 8.0f);
        b.reflectiveCurveTo(14.47f, 4.3f, 12.51f, 4.05f);
        b.close();
        b.moveTo(16.53f, 13.83f);
        b.curveTo(17.42f, 14.66f, 18.0f, 15.7f, 18.0f, 17.0f);
        kf0.z(b, 3.0f, 2.0f, -3.0f);
        b.curveTo(20.0f, 15.55f, 18.41f, 14.49f, 16.53f, 13.83f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _groupRemove = build;
        build.getClass();
        return build;
    }
}
