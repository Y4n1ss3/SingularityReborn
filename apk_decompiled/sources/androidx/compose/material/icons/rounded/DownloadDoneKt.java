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
import defpackage.af0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DownloadDoneKt {
    private static ImageVector _downloadDone;

    public static final ImageVector getDownloadDone(Icons.Rounded rounded) {
        ImageVector imageVector = _downloadDone;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DownloadDone", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(6.0f, 18.0f, 12.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        a.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        a.lineTo(6.0f, 20.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        a.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        a.close();
        a.moveTo(11.01f, 13.9f);
        a.curveToRelative(-0.78f, 0.77f, -2.04f, 0.77f, -2.82f, -0.01f);
        a.lineTo(6.0f, 11.7f);
        a.curveToRelative(-0.55f, -0.55f, -0.54f, -1.44f, 0.03f, -1.97f);
        a.curveToRelative(0.54f, -0.52f, 1.4f, -0.5f, 1.92f, 0.02f);
        a.lineTo(9.6f, 11.4f);
        a.lineToRelative(6.43f, -6.43f);
        a.curveToRelative(0.54f, -0.54f, 1.41f, -0.54f, 1.95f, 0.0f);
        a.lineToRelative(0.04f, 0.04f);
        a.curveToRelative(0.54f, 0.54f, 0.54f, 1.42f, -0.01f, 1.96f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(a, -7.0f, 6.93f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _downloadDone = build;
        build.getClass();
        return build;
    }
}
