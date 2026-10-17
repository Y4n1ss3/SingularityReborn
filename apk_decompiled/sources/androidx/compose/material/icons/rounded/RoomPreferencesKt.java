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
import defpackage.fc;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RoomPreferencesKt {
    private static ImageVector _roomPreferences;

    public static final ImageVector getRoomPreferences(Icons.Rounded rounded) {
        ImageVector imageVector = _roomPreferences;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RoomPreferences", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.75f, 17.0f);
        b.curveToRelative(0.0f, -0.22f, -0.03f, -0.42f, -0.06f, -0.63f);
        b.lineToRelative(0.84f, -0.73f);
        b.curveToRelative(0.18f, -0.16f, 0.22f, -0.42f, 0.1f, -0.63f);
        b.lineToRelative(-0.59f, -1.02f);
        b.curveToRelative(-0.12f, -0.21f, -0.37f, -0.3f, -0.59f, -0.22f);
        b.lineToRelative(-1.06f, 0.36f);
        b.curveToRelative(-0.32f, -0.27f, -0.68f, -0.48f, -1.08f, -0.63f);
        b.lineToRelative(-0.22f, -1.09f);
        b.curveToRelative(-0.05f, -0.23f, -0.25f, -0.4f, -0.49f, -0.4f);
        b.horizontalLineToRelative(-1.18f);
        b.curveToRelative(-0.24f, 0.0f, -0.44f, 0.17f, -0.49f, 0.4f);
        b.lineToRelative(-0.22f, 1.09f);
        b.curveToRelative(-0.4f, 0.15f, -0.76f, 0.36f, -1.08f, 0.63f);
        b.lineToRelative(-1.06f, -0.36f);
        b.curveToRelative(-0.23f, -0.08f, -0.47f, 0.02f, -0.59f, 0.22f);
        b.lineToRelative(-0.59f, 1.02f);
        b.curveToRelative(-0.12f, 0.21f, -0.08f, 0.47f, 0.1f, 0.63f);
        b.lineToRelative(0.84f, 0.73f);
        b.curveToRelative(-0.03f, 0.21f, -0.06f, 0.41f, -0.06f, 0.63f);
        b.reflectiveCurveToRelative(0.03f, 0.42f, 0.06f, 0.63f);
        b.lineToRelative(-0.84f, 0.73f);
        b.curveToRelative(-0.18f, 0.16f, -0.22f, 0.42f, -0.1f, 0.63f);
        b.lineToRelative(0.59f, 1.02f);
        b.curveToRelative(0.12f, 0.21f, 0.37f, 0.3f, 0.59f, 0.22f);
        b.lineToRelative(1.06f, -0.36f);
        b.curveToRelative(0.32f, 0.27f, 0.68f, 0.48f, 1.08f, 0.63f);
        b.lineToRelative(0.22f, 1.09f);
        b.curveToRelative(0.05f, 0.23f, 0.25f, 0.4f, 0.49f, 0.4f);
        b.horizontalLineToRelative(1.18f);
        b.curveToRelative(0.24f, 0.0f, 0.44f, -0.17f, 0.49f, -0.4f);
        b.lineToRelative(0.22f, -1.09f);
        b.curveToRelative(0.4f, -0.15f, 0.76f, -0.36f, 1.08f, -0.63f);
        b.lineToRelative(1.06f, 0.36f);
        b.curveToRelative(0.23f, 0.08f, 0.47f, -0.02f, 0.59f, -0.22f);
        b.lineToRelative(0.59f, -1.02f);
        b.curveToRelative(0.12f, -0.21f, 0.08f, -0.47f, -0.1f, -0.63f);
        b.lineToRelative(-0.84f, -0.73f);
        b.curveTo(21.72f, 17.42f, 21.75f, 17.22f, 21.75f, 17.0f);
        b.close();
        b.moveTo(18.0f, 19.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveTo(19.1f, 19.0f, 18.0f, 19.0f);
        fc.A(b, 14.0f, 11.26f, 6.0f, 3.0f);
        bv.x(b, 4.0f, 2.0f, 5.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(-4.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineTo(6.0f);
        b.curveTo(5.45f, 3.0f, 5.0f, 3.45f, 5.0f, 4.0f);
        b.verticalLineToRelative(15.0f);
        b.horizontalLineTo(4.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(8.26f);
        b.curveTo(11.47f, 19.87f, 11.0f, 18.49f, 11.0f, 17.0f);
        b.curveTo(11.0f, 14.62f, 12.19f, 12.53f, 14.0f, 11.26f);
        b.close();
        b.moveTo(10.0f, 12.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 10.0f, 12.55f, 10.0f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _roomPreferences = build;
        build.getClass();
        return build;
    }
}
