package androidx.compose.ui.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.AndroidComposeUiFlags;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.SemanticsNodeCopy;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.util.ListUtilsKt;
import defpackage.b5;
import defpackage.bu;
import defpackage.d41;
import defpackage.dq;
import defpackage.fb0;
import defpackage.g10;
import defpackage.h10;
import defpackage.hm;
import defpackage.iy;
import defpackage.j;
import defpackage.jq;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.na0;
import defpackage.nf;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.q10;
import defpackage.vn;
import defpackage.w01;
import defpackage.y40;
import defpackage.yi;
import defpackage.zg;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidContentCaptureManager implements jq, View.OnAttachStateChangeListener {
    public static final String VIEW_STRUCTURE_BUNDLE_KEY_ADDITIONAL_INDEX = "android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX";
    public static final String VIEW_STRUCTURE_BUNDLE_KEY_TIMESTAMP = "android.view.contentcapture.EventTimestamp";
    private boolean checkingForSemanticsChanges;
    private final Runnable contentCaptureChangeChecker;
    private ContentCaptureSessionWrapper contentCaptureSession;
    private g10 currentSemanticsNodes;
    private long currentSemanticsNodesSnapshotTimestampMillis;
    private iy onContentCaptureSession;
    private na0 previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private final AndroidComposeView view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final List<ContentCaptureEvent> bufferedEvents = new ArrayList();
    private long SendRecurringContentCaptureEventsIntervalMillis = 100;
    private TranslateStatus translateStatus = TranslateStatus.SHOW_ORIGINAL;
    private boolean currentSemanticsNodesInvalidated = true;
    private final zg boundsUpdateChannel = d41.b(1, 6, null);
    private final Handler legacyMainHandler = new Handler(Looper.getMainLooper());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class TranslateStatus {
        private static final /* synthetic */ bu $ENTRIES;
        private static final /* synthetic */ TranslateStatus[] $VALUES;
        public static final TranslateStatus SHOW_ORIGINAL = new TranslateStatus("SHOW_ORIGINAL", 0);
        public static final TranslateStatus SHOW_TRANSLATED = new TranslateStatus("SHOW_TRANSLATED", 1);

        private static final /* synthetic */ TranslateStatus[] $values() {
            return new TranslateStatus[]{SHOW_ORIGINAL, SHOW_TRANSLATED};
        }

        static {
            TranslateStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = p01.k($values);
        }

        private TranslateStatus(String str, int i) {
        }

        public static bu getEntries() {
            return $ENTRIES;
        }

        public static TranslateStatus valueOf(String str) {
            return (TranslateStatus) Enum.valueOf(TranslateStatus.class, str);
        }

        public static TranslateStatus[] values() {
            return (TranslateStatus[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ViewTranslationHelperMethods {
        public static final ViewTranslationHelperMethods INSTANCE = new ViewTranslationHelperMethods();

        private ViewTranslationHelperMethods() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
        
            r3 = r3.getValue("android:text");
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        
            r3 = r3.getText();
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void doTranslation(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray<ViewTranslationResponse> longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
            SemanticsNode semanticsNode;
            AccessibilityAction accessibilityAction;
            ky kyVar;
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                long keyAt = longSparseArray.keyAt(i);
                ViewTranslationResponse m = b5.m(longSparseArray.get(keyAt));
                if (m != null && value != null && text != null && (semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) androidContentCaptureManager.getCurrentSemanticsNodes$ui().b((int) keyAt)) != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getSetTextSubstitution())) != null && (kyVar = (ky) accessibilityAction.getAction()) != null) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onVirtualViewTranslationResponses$lambda$0(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
            INSTANCE.doTranslation(androidContentCaptureManager, longSparseArray);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void onCreateVirtualViewTranslationRequests(AndroidContentCaptureManager androidContentCaptureManager, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
            SemanticsNode semanticsNode;
            String fastJoinToString$default;
            for (long j : jArr) {
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) androidContentCaptureManager.getCurrentSemanticsNodes$ui().b((int) j);
                if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null) {
                    ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(androidContentCaptureManager.getView().getAutofillId(), semanticsNode.getId());
                    List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getText());
                    if (list != null && (fastJoinToString$default = ListUtilsKt.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null)) != null) {
                        builder.setValue("android:text", TranslationRequestValue.forText(new AnnotatedString(fastJoinToString$default, null, 2, 0 == true ? 1 : 0)));
                        consumer.accept(builder.build());
                    }
                }
            }
        }

        public final void onVirtualViewTranslationResponses(final AndroidContentCaptureManager androidContentCaptureManager, final LongSparseArray<ViewTranslationResponse> longSparseArray) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (q10.b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                doTranslation(androidContentCaptureManager, longSparseArray);
            } else {
                androidContentCaptureManager.getView().post(new Runnable() { // from class: androidx.compose.ui.contentcapture.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidContentCaptureManager.ViewTranslationHelperMethods.onVirtualViewTranslationResponses$lambda$0(AndroidContentCaptureManager.this, longSparseArray);
                    }
                });
            }
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContentCaptureEventType.values().length];
            try {
                iArr[ContentCaptureEventType.VIEW_APPEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentCaptureEventType.VIEW_DISAPPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidContentCaptureManager(AndroidComposeView androidComposeView, iy iyVar) {
        this.view = androidComposeView;
        this.onContentCaptureSession = iyVar;
        na0 na0Var = h10.a;
        na0Var.getClass();
        this.currentSemanticsNodes = na0Var;
        this.previousSemanticsNodes = new na0();
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), na0Var);
        this.contentCaptureChangeChecker = new j(this, 2);
    }

    private final void bufferContentCaptureViewAppeared(int i, ViewStructureCompat viewStructureCompat) {
        if (viewStructureCompat == null) {
            return;
        }
        this.bufferedEvents.add(new ContentCaptureEvent(i, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_APPEAR, viewStructureCompat));
    }

    private final void bufferContentCaptureViewDisappeared(int i) {
        this.bufferedEvents.add(new ContentCaptureEvent(i, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_DISAPPEAR, null));
    }

    private final void checkForContentCapturePropertyChanges(g10 g10Var) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        SemanticsNode semanticsNode;
        int i2;
        SemanticsNode semanticsNode2;
        long j3;
        int i3;
        long[] jArr3;
        g10 g10Var2 = g10Var;
        int[] iArr3 = g10Var2.b;
        long[] jArr4 = g10Var2.a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr4[i4];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((j4 & 255) < 128) {
                        int i8 = iArr3[(i4 << 3) + i7];
                        c = c2;
                        SemanticsNodeCopy semanticsNodeCopy = (SemanticsNodeCopy) this.previousSemanticsNodes.b(i8);
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) g10Var2.b(i8);
                        SemanticsNode semanticsNode3 = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                        if (semanticsNode3 == null) {
                            throw k4.a("no value for specified key");
                        }
                        if (semanticsNodeCopy == null) {
                            fb0 props$ui = semanticsNode3.getUnmergedConfig$ui().getProps$ui();
                            j2 = j5;
                            Object[] objArr = props$ui.b;
                            long[] jArr5 = props$ui.a;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i9 = 0;
                                int i10 = i5;
                                while (true) {
                                    long j6 = jArr5[i9];
                                    iArr2 = iArr3;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i11 = 8 - ((~(i9 - length2)) >>> 31);
                                        int i12 = 0;
                                        while (i12 < i11) {
                                            if ((j6 & 255) < 128) {
                                                i3 = i12;
                                                SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) objArr[(i9 << 3) + i12];
                                                SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                                                jArr3 = jArr4;
                                                if (q10.b(semanticsPropertyKey, semanticsProperties.getText())) {
                                                    List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode3.getUnmergedConfig$ui(), semanticsProperties.getText());
                                                    sendContentCaptureTextUpdateEvent(semanticsNode3.getId(), String.valueOf(list != null ? (AnnotatedString) yi.q0(list) : null));
                                                }
                                            } else {
                                                i3 = i12;
                                                jArr3 = jArr4;
                                            }
                                            j6 >>= i10;
                                            i12 = i3 + 1;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        if (i11 != i10) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                    }
                                    if (i9 == length2) {
                                        break;
                                    }
                                    i9++;
                                    iArr3 = iArr2;
                                    jArr4 = jArr2;
                                    i10 = 8;
                                }
                            } else {
                                iArr2 = iArr3;
                                jArr2 = jArr4;
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr4;
                            j2 = j5;
                            fb0 props$ui2 = semanticsNode3.getUnmergedConfig$ui().getProps$ui();
                            Object[] objArr2 = props$ui2.b;
                            long[] jArr6 = props$ui2.a;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                int i13 = 0;
                                while (true) {
                                    long j7 = jArr6[i13];
                                    long[] jArr7 = jArr6;
                                    Object[] objArr3 = objArr2;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j7 & 255) < 128) {
                                                i2 = i15;
                                                SemanticsPropertyKey semanticsPropertyKey2 = (SemanticsPropertyKey) objArr3[(i13 << 3) + i15];
                                                SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
                                                semanticsNode2 = semanticsNode3;
                                                if (q10.b(semanticsPropertyKey2, semanticsProperties2.getText())) {
                                                    List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), semanticsProperties2.getText());
                                                    AnnotatedString annotatedString = list2 != null ? (AnnotatedString) yi.q0(list2) : null;
                                                    j3 = j4;
                                                    List list3 = (List) SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig$ui(), semanticsProperties2.getText());
                                                    AnnotatedString annotatedString2 = list3 != null ? (AnnotatedString) yi.q0(list3) : null;
                                                    if (!q10.b(annotatedString, annotatedString2)) {
                                                        sendContentCaptureTextUpdateEvent(semanticsNode2.getId(), String.valueOf(annotatedString2));
                                                    }
                                                    j7 >>= 8;
                                                    i15 = i2 + 1;
                                                    semanticsNode3 = semanticsNode2;
                                                    j4 = j3;
                                                }
                                            } else {
                                                i2 = i15;
                                                semanticsNode2 = semanticsNode3;
                                            }
                                            j3 = j4;
                                            j7 >>= 8;
                                            i15 = i2 + 1;
                                            semanticsNode3 = semanticsNode2;
                                            j4 = j3;
                                        }
                                        semanticsNode = semanticsNode3;
                                        j = j4;
                                        if (i14 != 8) {
                                            break;
                                        }
                                    } else {
                                        semanticsNode = semanticsNode3;
                                        j = j4;
                                    }
                                    if (i13 == length3) {
                                        break;
                                    }
                                    i13++;
                                    objArr2 = objArr3;
                                    jArr6 = jArr7;
                                    semanticsNode3 = semanticsNode;
                                    j4 = j;
                                }
                                i = 8;
                            }
                        }
                        j = j4;
                        i = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr4;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i5;
                    }
                    j4 = j >> i;
                    i7++;
                    g10Var2 = g10Var;
                    i5 = i;
                    c2 = c;
                    j5 = j2;
                    iArr3 = iArr2;
                    jArr4 = jArr2;
                }
                iArr = iArr3;
                jArr = jArr4;
                if (i6 != i5) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr4;
            }
            if (i4 == length) {
                return;
            }
            i4++;
            g10Var2 = g10Var;
            iArr3 = iArr;
            jArr4 = jArr;
        }
    }

    private final void clearTranslatedText() {
        AccessibilityAction accessibilityAction;
        iy iyVar;
        g10 currentSemanticsNodes$ui = getCurrentSemanticsNodes$ui();
        Object[] objArr = currentSemanticsNodes$ui.c;
        long[] jArr = currentSemanticsNodes$ui.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        SemanticsConfiguration unmergedConfig$ui = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3]).getSemanticsNode().getUnmergedConfig$ui();
                        if (SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getClearTextSubstitution())) != null && (iyVar = (iy) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void contentCaptureChangeChecker$lambda$0(AndroidContentCaptureManager androidContentCaptureManager) {
        if (androidContentCaptureManager.isEnabled$ui()) {
            Trace.beginSection("ContentCapture:changeChecker");
            try {
                Owner.measureAndLayout$default(androidContentCaptureManager.view, false, 1, null);
                androidContentCaptureManager.sendContentCaptureDisappearEvents();
                Trace.beginSection("ContentCapture:sendAppearEvents");
                androidContentCaptureManager.sendContentCaptureAppearEvents(androidContentCaptureManager.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), androidContentCaptureManager.previousSemanticsRoot);
                Trace.endSection();
                androidContentCaptureManager.checkForContentCapturePropertyChanges(androidContentCaptureManager.getCurrentSemanticsNodes$ui());
                androidContentCaptureManager.updateSemanticsCopy();
                androidContentCaptureManager.checkingForSemanticsChanges = false;
            } catch (Throwable th) {
                throw th;
            } finally {
                Trace.endSection();
            }
        }
    }

    private final <T> void fastForEachIndexedWithFilter(List<? extends T> list, my myVar, ky kyVar) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (((Boolean) kyVar.invoke(t)).booleanValue()) {
                myVar.invoke(Integer.valueOf(i), t);
                i++;
            }
        }
    }

    private final void fastForEachReplacedVisibleChildren(SemanticsNode semanticsNode, my myVar) {
        List<SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
        int size = replacedChildren$ui.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui.get(i2);
            if (getCurrentSemanticsNodes$ui().a(semanticsNode2.getId())) {
                myVar.invoke(Integer.valueOf(i), semanticsNode2);
                i++;
            }
        }
    }

    private final void hideTranslatedText() {
        AccessibilityAction accessibilityAction;
        ky kyVar;
        g10 currentSemanticsNodes$ui = getCurrentSemanticsNodes$ui();
        Object[] objArr = currentSemanticsNodes$ui.c;
        long[] jArr = currentSemanticsNodes$ui.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        SemanticsConfiguration unmergedConfig$ui = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3]).getSemanticsNode().getUnmergedConfig$ui();
                        if (q10.b(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.TRUE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (kyVar = (ky) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void notifyContentCaptureChanges() {
        ContentCaptureSessionWrapper contentCaptureSessionWrapper = this.contentCaptureSession;
        if (contentCaptureSessionWrapper == null || this.bufferedEvents.isEmpty()) {
            return;
        }
        List<ContentCaptureEvent> list = this.bufferedEvents;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ContentCaptureEvent contentCaptureEvent = list.get(i);
            int i2 = WhenMappings.$EnumSwitchMapping$0[contentCaptureEvent.getType().ordinal()];
            if (i2 == 1) {
                ViewStructureCompat structureCompat = contentCaptureEvent.getStructureCompat();
                if (structureCompat != null) {
                    contentCaptureSessionWrapper.notifyViewAppeared(structureCompat.toViewStructure());
                }
            } else if (i2 != 2) {
                o.n();
                return;
            } else {
                AutofillId newAutofillId = contentCaptureSessionWrapper.newAutofillId(contentCaptureEvent.getId());
                if (newAutofillId != null) {
                    contentCaptureSessionWrapper.notifyViewDisappeared(newAutofillId);
                }
            }
        }
        contentCaptureSessionWrapper.flush();
        this.bufferedEvents.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeStateChangeIfNeeded() {
        this.boundsUpdateChannel.m(w01.a);
    }

    private final void sendContentCaptureAppearEvents(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        fastForEachReplacedVisibleChildren(semanticsNode, new AndroidContentCaptureManager$sendContentCaptureAppearEvents$1(semanticsNodeCopy, this));
        List<SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
        int size = replacedChildren$ui.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui.get(i);
            if (getCurrentSemanticsNodes$ui().a(semanticsNode2.getId()) && this.previousSemanticsNodes.a(semanticsNode2.getId())) {
                Object b = this.previousSemanticsNodes.b(semanticsNode2.getId());
                if (b == null) {
                    throw k4.a("node not present in pruned tree before this change");
                }
                sendContentCaptureAppearEvents(semanticsNode2, (SemanticsNodeCopy) b);
            }
        }
    }

    private final void sendContentCaptureDisappearEvents() {
        na0 na0Var = this.previousSemanticsNodes;
        int[] iArr = na0Var.b;
        long[] jArr = na0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = iArr[(i << 3) + i3];
                        if (!getCurrentSemanticsNodes$ui().a(i4)) {
                            bufferContentCaptureViewDisappeared(i4);
                            notifySubtreeStateChangeIfNeeded();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void sendContentCaptureTextUpdateEvent(int i, String str) {
        ContentCaptureSessionWrapper contentCaptureSessionWrapper = this.contentCaptureSession;
        if (contentCaptureSessionWrapper == null) {
            return;
        }
        AutofillId newAutofillId = contentCaptureSessionWrapper.newAutofillId(i);
        if (newAutofillId == null) {
            throw k4.a("Invalid content capture ID");
        }
        contentCaptureSessionWrapper.notifyViewTextChanged(newAutofillId, str);
    }

    private final void showTranslatedText() {
        AccessibilityAction accessibilityAction;
        ky kyVar;
        g10 currentSemanticsNodes$ui = getCurrentSemanticsNodes$ui();
        Object[] objArr = currentSemanticsNodes$ui.c;
        long[] jArr = currentSemanticsNodes$ui.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        SemanticsConfiguration unmergedConfig$ui = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3]).getSemanticsNode().getUnmergedConfig$ui();
                        if (q10.b(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (kyVar = (ky) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final ViewStructureCompat toViewStructure(SemanticsNode semanticsNode, int i) {
        AutofillIdCompat autofillId;
        AutofillId autofillId2;
        String m6799toLegacyClassNameV4PA4sw;
        ContentCaptureSessionWrapper contentCaptureSessionWrapper = this.contentCaptureSession;
        if (contentCaptureSessionWrapper == null || (autofillId = ViewCompatShims.getAutofillId(this.view)) == null) {
            return null;
        }
        if (semanticsNode.getParent() != null) {
            autofillId2 = contentCaptureSessionWrapper.newAutofillId(r4.getId());
            if (autofillId2 == null) {
                return null;
            }
        } else {
            autofillId2 = autofillId.toAutofillId();
        }
        ViewStructureCompat newVirtualViewStructure = contentCaptureSessionWrapper.newVirtualViewStructure(autofillId2, semanticsNode.getId());
        if (newVirtualViewStructure == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui.contains(semanticsProperties.getPassword())) {
            return null;
        }
        Bundle extras = newVirtualViewStructure.getExtras();
        if (extras != null) {
            extras.putLong(VIEW_STRUCTURE_BUNDLE_KEY_TIMESTAMP, this.currentSemanticsNodesSnapshotTimestampMillis);
            extras.putInt(VIEW_STRUCTURE_BUNDLE_KEY_ADDITIONAL_INDEX, i);
        }
        String str = (String) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getTestTag());
        if (str != null) {
            newVirtualViewStructure.setId(semanticsNode.getId(), null, null, str);
        }
        if (((Boolean) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getIsTraversalGroup())) != null) {
            newVirtualViewStructure.setClassName("android.widget.ViewGroup");
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getText());
        if (list != null) {
            newVirtualViewStructure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
            newVirtualViewStructure.setText(ListUtilsKt.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null));
        }
        AnnotatedString annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getEditableText());
        if (annotatedString != null) {
            newVirtualViewStructure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
            newVirtualViewStructure.setText(annotatedString);
        }
        List list2 = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getContentDescription());
        if (list2 != null) {
            newVirtualViewStructure.setContentDescription(ListUtilsKt.fastJoinToString$default(list2, "\n", null, null, 0, null, null, 62, null));
        }
        Role role = (Role) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getRole());
        if (role != null && (m6799toLegacyClassNameV4PA4sw = SemanticsUtils_androidKt.m6799toLegacyClassNameV4PA4sw(role.m6827unboximpl())) != null) {
            newVirtualViewStructure.setClassName(m6799toLegacyClassNameV4PA4sw);
        }
        TextLayoutResult textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(unmergedConfig$ui);
        if (textLayoutResult != null) {
            TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
            newVirtualViewStructure.setTextStyle(layoutInput.getDensity().getFontScale() * layoutInput.getDensity().getDensity() * TextUnit.m7805getValueimpl(layoutInput.getStyle().m7091getFontSizeXSAIIZE()), 0, 0, 0);
        }
        Rect boundsInParent$ui = semanticsNode.getBoundsInParent$ui();
        newVirtualViewStructure.setDimens((int) boundsInParent$ui.getLeft(), (int) boundsInParent$ui.getTop(), 0, 0, (int) (boundsInParent$ui.getRight() - boundsInParent$ui.getLeft()), (int) (boundsInParent$ui.getBottom() - boundsInParent$ui.getTop()));
        return newVirtualViewStructure;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBuffersOnAppeared(int i, SemanticsNode semanticsNode) {
        if (isEnabled$ui()) {
            updateTranslationOnAppeared(semanticsNode);
            bufferContentCaptureViewAppeared(semanticsNode.getId(), toViewStructure(semanticsNode, i));
            fastForEachReplacedVisibleChildren(semanticsNode, new AndroidContentCaptureManager$updateBuffersOnAppeared$1(this));
        }
    }

    private final void updateBuffersOnDisappeared(SemanticsNode semanticsNode) {
        if (isEnabled$ui()) {
            bufferContentCaptureViewDisappeared(semanticsNode.getId());
            List<SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
            int size = replacedChildren$ui.size();
            for (int i = 0; i < size; i++) {
                updateBuffersOnDisappeared(replacedChildren$ui.get(i));
            }
        }
    }

    private final void updateSemanticsCopy() {
        this.previousSemanticsNodes.c();
        g10 currentSemanticsNodes$ui = getCurrentSemanticsNodes$ui();
        int[] iArr = currentSemanticsNodes$ui.b;
        Object[] objArr = currentSemanticsNodes$ui.c;
        long[] jArr = currentSemanticsNodes$ui.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            this.previousSemanticsNodes.i(iArr[i4], new SemanticsNodeCopy(((SemanticsNodeWithAdjustedBounds) objArr[i4]).getSemanticsNode(), getCurrentSemanticsNodes$ui()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes$ui());
    }

    private final void updateTranslationOnAppeared(SemanticsNode semanticsNode) {
        AccessibilityAction accessibilityAction;
        ky kyVar;
        ky kyVar2;
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution());
        if (this.translateStatus == TranslateStatus.SHOW_ORIGINAL && q10.b(bool, Boolean.TRUE)) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getShowTextSubstitution());
            if (accessibilityAction2 == null || (kyVar2 = (ky) accessibilityAction2.getAction()) == null) {
                return;
            }
            return;
        }
        if (this.translateStatus != TranslateStatus.SHOW_TRANSLATED || !q10.b(bool, Boolean.FALSE) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getShowTextSubstitution())) == null || (kyVar = (ky) accessibilityAction.getAction()) == null) {
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (defpackage.y80.p(r5, r0) == r4) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0084 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object boundsUpdatesEventLoop$ui(hm hmVar) {
        AndroidContentCaptureManager$boundsUpdatesEventLoop$1 androidContentCaptureManager$boundsUpdatesEventLoop$1;
        int i;
        nf it;
        nf nfVar;
        Object b;
        if (hmVar instanceof AndroidContentCaptureManager$boundsUpdatesEventLoop$1) {
            androidContentCaptureManager$boundsUpdatesEventLoop$1 = (AndroidContentCaptureManager$boundsUpdatesEventLoop$1) hmVar;
            int i2 = androidContentCaptureManager$boundsUpdatesEventLoop$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidContentCaptureManager$boundsUpdatesEventLoop$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidContentCaptureManager$boundsUpdatesEventLoop$1.result;
                i = androidContentCaptureManager$boundsUpdatesEventLoop$1.label;
                vn vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    it = this.boundsUpdateChannel.iterator();
                    androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0 = it;
                    androidContentCaptureManager$boundsUpdatesEventLoop$1.label = 1;
                    b = it.b(androidContentCaptureManager$boundsUpdatesEventLoop$1);
                    if (b != vnVar) {
                    }
                    return vnVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nfVar = (nf) androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0;
                    p10.Q(obj);
                    it = nfVar;
                    androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0 = it;
                    androidContentCaptureManager$boundsUpdatesEventLoop$1.label = 1;
                    b = it.b(androidContentCaptureManager$boundsUpdatesEventLoop$1);
                    if (b != vnVar) {
                        nfVar = it;
                        obj = b;
                        if (((Boolean) obj).booleanValue()) {
                            return w01.a;
                        }
                        nfVar.c();
                        if (isEnabled$ui()) {
                            notifyContentCaptureChanges();
                        }
                        Handler handler$ui = getHandler$ui();
                        if (!this.checkingForSemanticsChanges && handler$ui != null) {
                            this.checkingForSemanticsChanges = true;
                            handler$ui.post(this.contentCaptureChangeChecker);
                        }
                        long j = this.SendRecurringContentCaptureEventsIntervalMillis;
                        androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0 = nfVar;
                        androidContentCaptureManager$boundsUpdatesEventLoop$1.label = 2;
                    }
                    return vnVar;
                }
                nfVar = (nf) androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0;
                p10.Q(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            }
        }
        androidContentCaptureManager$boundsUpdatesEventLoop$1 = new AndroidContentCaptureManager$boundsUpdatesEventLoop$1(this, hmVar);
        Object obj2 = androidContentCaptureManager$boundsUpdatesEventLoop$1.result;
        i = androidContentCaptureManager$boundsUpdatesEventLoop$1.label;
        vn vnVar2 = vn.d;
        if (i != 0) {
        }
    }

    public final ContentCaptureSessionWrapper getContentCaptureSession$ui() {
        return this.contentCaptureSession;
    }

    public final g10 getCurrentSemanticsNodes$ui() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsOwnerKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner(), -1, AndroidContentCaptureManager$currentSemanticsNodes$1.INSTANCE);
            this.currentSemanticsNodesSnapshotTimestampMillis = System.currentTimeMillis();
        }
        return this.currentSemanticsNodes;
    }

    public final Handler getHandler$ui() {
        return AndroidComposeUiFlags.isViewBasedSemanticsHandlerEnabled ? this.view.getHandler() : this.legacyMainHandler;
    }

    public final iy getOnContentCaptureSession() {
        return this.onContentCaptureSession;
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    public final boolean isEnabled$ui() {
        return ContentCaptureManager.Companion.isEnabled() && this.contentCaptureSession != null;
    }

    public final void onClearTranslation$ui() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        clearTranslatedText();
    }

    @Override // defpackage.jq
    public void onCreate(y40 y40Var) {
        y40Var.getClass();
    }

    public final void onCreateVirtualViewTranslationRequests$ui(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        ViewTranslationHelperMethods.INSTANCE.onCreateVirtualViewTranslationRequests(this, jArr, iArr, consumer);
    }

    @Override // defpackage.jq
    public void onDestroy(y40 y40Var) {
        y40Var.getClass();
    }

    public final void onHideTranslation$ui() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        hideTranslatedText();
    }

    public final void onLayoutChange$ui() {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui()) {
            notifySubtreeStateChangeIfNeeded();
        }
    }

    @Override // defpackage.jq
    public void onPause(y40 y40Var) {
        y40Var.getClass();
    }

    @Override // defpackage.jq
    public void onResume(y40 y40Var) {
        y40Var.getClass();
    }

    public final void onSemanticsChange$ui() {
        this.currentSemanticsNodesInvalidated = true;
        Handler handler$ui = getHandler$ui();
        if (!isEnabled$ui() || this.checkingForSemanticsChanges || handler$ui == null) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        handler$ui.post(this.contentCaptureChangeChecker);
    }

    public final void onShowTranslation$ui() {
        this.translateStatus = TranslateStatus.SHOW_TRANSLATED;
        showTranslatedText();
    }

    @Override // defpackage.jq
    public void onStart(y40 y40Var) {
        this.contentCaptureSession = (ContentCaptureSessionWrapper) this.onContentCaptureSession.invoke();
        updateBuffersOnAppeared(-1, this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
    }

    @Override // defpackage.jq
    public void onStop(y40 y40Var) {
        updateBuffersOnDisappeared(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
        this.contentCaptureSession = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Handler handler$ui = getHandler$ui();
        handler$ui.getClass();
        handler$ui.removeCallbacks(this.contentCaptureChangeChecker);
        this.contentCaptureSession = null;
    }

    public final void onVirtualViewTranslationResponses$ui(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray<ViewTranslationResponse> longSparseArray) {
        ViewTranslationHelperMethods.INSTANCE.onVirtualViewTranslationResponses(androidContentCaptureManager, longSparseArray);
    }

    public final void setContentCaptureSession$ui(ContentCaptureSessionWrapper contentCaptureSessionWrapper) {
        this.contentCaptureSession = contentCaptureSessionWrapper;
    }

    public final void setCurrentSemanticsNodes$ui(g10 g10Var) {
        this.currentSemanticsNodes = g10Var;
    }

    public final void setOnContentCaptureSession(iy iyVar) {
        this.onContentCaptureSession = iyVar;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getContentCaptureSession$ui$annotations() {
    }

    public static /* synthetic */ void getHandler$ui$annotations() {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
