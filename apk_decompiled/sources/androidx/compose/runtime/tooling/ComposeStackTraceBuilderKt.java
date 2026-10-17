package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotReader;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import defpackage.ky;
import defpackage.q10;
import defpackage.ut;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposeStackTraceBuilderKt {
    public static final List<ComposeStackTraceFrame> buildTrace(SlotWriter slotWriter, Object obj, int i, Integer num) {
        int groupKey;
        if (slotWriter.getClosed() || slotWriter.getSize$runtime() == 0) {
            return ut.d;
        }
        WriterTraceBuilder writerTraceBuilder = new WriterTraceBuilder(slotWriter);
        int intValue = num != null ? num.intValue() : slotWriter.getParent() < 0 ? slotWriter.parent(i) : slotWriter.getParent();
        if (obj == null) {
            obj = Integer.valueOf(slotWriter.groupSlotIndex(i));
        }
        if (slotWriter.isValid(i)) {
            groupKey = slotWriter.groupKey(i);
        } else {
            int parent = intValue >= 0 ? slotWriter.parent(intValue) : intValue;
            groupKey = slotWriter.groupKey(intValue);
            int i2 = intValue;
            intValue = parent;
            i = i2;
        }
        while (i >= 0) {
            writerTraceBuilder.processEdge(groupKey, slotWriter.hasObjectKey(i) ? slotWriter.groupObjectKey(i) : Composer.Companion.getEmpty(), slotWriter.sourceInformationOf$runtime(i), obj);
            obj = slotWriter.anchor(i);
            if (intValue >= 0) {
                int parent2 = slotWriter.parent(intValue);
                groupKey = slotWriter.groupKey(intValue);
                int i3 = intValue;
                intValue = parent2;
                i = i3;
            } else {
                i = intValue;
            }
        }
        return writerTraceBuilder.trace();
    }

    public static /* synthetic */ List buildTrace$default(SlotWriter slotWriter, Object obj, int i, Integer num, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        if ((i2 & 2) != 0) {
            i = slotWriter.getCurrentGroup();
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        return buildTrace(slotWriter, obj, i, num);
    }

    public static final ObjectLocation findLocation(SlotTable slotTable, ky kyVar) {
        SlotReader openReader = slotTable.openReader();
        for (int i = 0; i < slotTable.getGroupsSize(); i++) {
            try {
                if (openReader.isNode(i) && ((Boolean) kyVar.invoke(openReader.node(i))).booleanValue()) {
                    return new ObjectLocation(i, null);
                }
                int slotSize = openReader.slotSize(i);
                for (int i2 = 0; i2 < slotSize; i2++) {
                    if (((Boolean) kyVar.invoke(openReader.groupGet(i, i2))).booleanValue()) {
                        return new ObjectLocation(i, Integer.valueOf(i2));
                    }
                }
            } finally {
                openReader.close();
            }
        }
        return null;
    }

    public static final Integer findSubcompositionContextGroup(SlotTable slotTable, CompositionContext compositionContext) {
        SlotReader openReader = slotTable.openReader();
        try {
            return findSubcompositionContextGroup$lambda$0$scanGroup(openReader, compositionContext, 0, openReader.getSize());
        } finally {
            openReader.close();
        }
    }

    private static final Integer findSubcompositionContextGroup$lambda$0$scanGroup(SlotReader slotReader, CompositionContext compositionContext, int i, int i2) {
        Integer findSubcompositionContextGroup$lambda$0$scanGroup;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int groupSize = slotReader.groupSize(i) + i;
            if (slotReader.hasMark(i) && slotReader.groupKey(i) == 206 && q10.b(slotReader.groupObjectKey(i), ComposerKt.getReference())) {
                Object groupGet = slotReader.groupGet(i, 0);
                RememberObserverHolder rememberObserverHolder = groupGet instanceof RememberObserverHolder ? (RememberObserverHolder) groupGet : null;
                Object wrapped = rememberObserverHolder != null ? rememberObserverHolder.getWrapped() : null;
                GapComposer.CompositionContextHolder compositionContextHolder = wrapped instanceof GapComposer.CompositionContextHolder ? (GapComposer.CompositionContextHolder) wrapped : null;
                if (compositionContextHolder != null && q10.b(compositionContextHolder.getRef(), compositionContext)) {
                    return Integer.valueOf(i);
                }
            }
            if (slotReader.containsMark(i) && (findSubcompositionContextGroup$lambda$0$scanGroup = findSubcompositionContextGroup$lambda$0$scanGroup(slotReader, compositionContext, i + 1, groupSize)) != null) {
                return Integer.valueOf(findSubcompositionContextGroup$lambda$0$scanGroup.intValue());
            }
            i = groupSize;
        }
    }

    public static final List<ComposeStackTraceFrame> traceForGroup(SlotReader slotReader, int i, Object obj) {
        ReaderTraceBuilder readerTraceBuilder = new ReaderTraceBuilder(slotReader);
        int parent = slotReader.parent(i);
        GapAnchor anchor = slotReader.anchor(i);
        while (i >= 0) {
            readerTraceBuilder.processEdge(slotReader.groupKey(i), slotReader.hasObjectKey(i) ? slotReader.groupObjectKey(i) : Composer.Companion.getEmpty(), slotReader.getTable$runtime().sourceInformationOf(i), obj);
            if (parent >= 0) {
                GapAnchor gapAnchor = anchor;
                anchor = slotReader.anchor(parent);
                i = parent;
                parent = slotReader.parent(parent);
                obj = gapAnchor;
            } else {
                i = parent;
                obj = anchor;
            }
        }
        return readerTraceBuilder.trace();
    }

    public static final List<ComposeStackTraceFrame> buildTrace(SlotReader slotReader) {
        Object empty;
        if (!slotReader.getClosed() && slotReader.getSize() != 0) {
            ReaderTraceBuilder readerTraceBuilder = new ReaderTraceBuilder(slotReader);
            int parent = slotReader.getParent();
            Object valueOf = Integer.valueOf(slotReader.getSlot());
            while (parent >= 0) {
                if (slotReader.hasObjectKey(parent)) {
                    empty = slotReader.groupObjectKey(parent);
                } else {
                    empty = Composer.Companion.getEmpty();
                }
                readerTraceBuilder.processEdge(slotReader.groupKey(parent), empty, slotReader.getTable$runtime().sourceInformationOf(parent), valueOf);
                valueOf = slotReader.anchor(parent);
                parent = slotReader.parent(parent);
            }
            return readerTraceBuilder.trace();
        }
        return ut.d;
    }
}
