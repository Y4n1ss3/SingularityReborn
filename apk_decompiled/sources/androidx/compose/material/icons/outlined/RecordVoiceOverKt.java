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
import defpackage.fc;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RecordVoiceOverKt {
    private static ImageVector _recordVoiceOver;

    public static final ImageVector getRecordVoiceOver(Icons.Outlined outlined) {
        ImageVector imageVector = _recordVoiceOver;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RecordVoiceOver", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.0f, 13.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        b.reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f);
        b.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        b.close();
        b.moveTo(9.0f, 7.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.close();
        b.moveTo(9.0f, 15.0f);
        b.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        kf0.z(b, 2.0f, 16.0f, -2.0f);
        b.curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        b.close();
        b.moveTo(3.0f, 19.0f);
        b.curveToRelative(0.22f, -0.72f, 3.31f, -2.0f, 6.0f, -2.0f);
        b.curveToRelative(2.7f, 0.0f, 5.8f, 1.29f, 6.0f, 2.0f);
        uo.l(b, 3.0f, 19.0f, 15.08f, 7.05f);
        b.curveToRelative(0.84f, 1.18f, 0.84f, 2.71f, 0.0f, 3.89f);
        b.lineToRelative(1.68f, 1.69f);
        b.curveToRelative(2.02f, -2.02f, 2.02f, -5.07f, 0.0f, -7.27f);
        fc.B(b, -1.68f, 1.69f, 20.07f, 2.0f);
        b.lineToRelative(-1.63f, 1.63f);
        b.curveToRelative(2.77f, 3.02f, 2.77f, 7.56f, 0.0f, 10.74f);
        b.lineTo(20.07f, 16.0f);
        b.curveToRelative(3.9f, -3.89f, 3.91f, -9.95f, 0.0f, -14.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _recordVoiceOver = build;
        build.getClass();
        return build;
    }
}
